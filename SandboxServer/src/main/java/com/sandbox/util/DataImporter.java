package com.sandbox.util;

import static com.sandbox.util.Close.close;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
		
		
		//workbook opened successfully, begin reading data
		Sheet castleSheet = workbook.getSheet("Castle"); 
		int numRows = castleSheet.getLastRowNum() - castleSheet.getFirstRowNum() + 1; 

		
		
		//finished. Close resources and return; 
		close(fis); 
		close(workbook); 
	}
	
	
	
	

}
