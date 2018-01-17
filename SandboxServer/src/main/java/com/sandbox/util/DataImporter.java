package com.sandbox.util;

import static com.sandbox.util.Close.close;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sandbox.dao.CastleDao;
import com.sandbox.dao.TroopDao;
import com.sandbox.model.Castle;
import com.sandbox.model.Troop; 


public class DataImporter {

	private static final String FILE_PATH = "src/main/resources/data.xlsx";

	public static void importFromWorkbook() {
		//Open Workbook. Return null on failure.
		File file = null; 
		FileInputStream fis = null; 
		Workbook workbook = null; 
		try { 
			file = new File(FILE_PATH); 
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			close(fis); 
			close(workbook); 
			return;
		} catch (IOException e) {
			close(fis); 
			close(workbook); 
			e.printStackTrace();
			return; 
		}

		///
		//workbook opened successfully, begin reading data
		///
		
		//hashmap to conveniently hold and access troop names for checking later 
		HashMap<String, Troop> troops = new HashMap<>(); 
		String name, salute;
		int strength, col = 0; 

		//read data for troops from sheet
		Sheet troopSheet = workbook.getSheet("Troop"); 
		int numRows = troopSheet.getLastRowNum() - troopSheet.getFirstRowNum() + 1; 
		for(int i = 1; i < numRows; i++) {
			//read data row by row
			Row row = troopSheet.getRow(i); 
			try {
				col = 1; 
				name = row.getCell(col++).getStringCellValue();
				salute = row.getCell(col++).getStringCellValue();
				strength = (int)row.getCell(col++).getNumericCellValue(); 
				Troop t = new Troop(name, salute, strength); 
				troops.put(name, t); 
			}
			//catch improper input in workbook, throw out current parsed object
			catch(IllegalStateException e) {
				System.out.println("Improper input in Troop sheet, line " + (i+1) + ", col " + (col));
				continue; 
			}
		}
		troops.values().forEach(System.out::println);

		///
		// troops read in. Begin reading in castle data
		///
		
		//read data for castles from sheet
		ArrayList<Castle> castles = new ArrayList<>(); 
		String castleName, factionName;
		int wallStrength;
		Sheet castleSheet = workbook.getSheet("Castle"); 
		numRows = castleSheet.getLastRowNum() - castleSheet.getFirstRowNum() + 1; 
		for(int i = 1; i < numRows; i++) {
			//read castle info row by row
			Row row = castleSheet.getRow(i); 
			col = 1; 
			try {
				castleName = row.getCell(col++).getStringCellValue();
				factionName = row.getCell(col++).getStringCellValue();
				wallStrength = (int)row.getCell(col++).getNumericCellValue();
				Castle c = new Castle(castleName, factionName, wallStrength); 
				//add troops one by one, verifying they exist in troops listing
				String tName;
				do {
					tName = row.getCell(col++).getStringCellValue();
					if(troops.containsKey(tName)) {
						c.addTroop(troops.get(tName)); 
					}
					
				} while(!tName.equals("/")); 
				//finished successfully, add castle to collection
				castles.add(c); 
			}
			//catch improper input in workbook, throw out current parsed object
			catch(IllegalStateException e) {
				System.out.println("Improper input in Castle sheet, line " + (i+1) + ", col " + (col));
				continue; 
			}
		}
		castles.forEach(System.out::println);
		
		///
		// Finished reading troop and castle data, send the read objects to database
		///
		
		TroopDao td = TroopDao.getTroopDao();
		troops.values().forEach(td::insertTroop);
		
		CastleDao cd = CastleDao.getCastleDao();
		castles.forEach(cd::insertCastle);



		//finished. Close resources and return; 
		close(fis); 
		close(workbook); 
	}





}
