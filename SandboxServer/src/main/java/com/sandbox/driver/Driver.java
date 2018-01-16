package com.sandbox.driver;

import com.sandbox.dao.CastleDao;
import com.sandbox.dao.TroopDao;
import com.sandbox.model.Castle;
import com.sandbox.model.Troop;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Hello World");
		CastleDao cd = CastleDao.getCastleDao(); 
		TroopDao td = TroopDao.getTroopDao();
		
		Troop t1 = new Troop("Caldwell", "Yes, Sir!", 10); 
		td.insertTroop(t1); 
		Troop tBack = td.getTroopByName("Caldwell");
		System.out.println(tBack);
		Long id = tBack.getId(); 
		System.out.println("Troop inserted at " + id);
		System.out.println("Equal?? : " + (tBack == t1));

		Castle c = new Castle("Einfort", "Newcomers", 100); 
		c.addTroop(t1);

		Long l = cd.insertCastle(c);
		System.out.println("Inserted castle at id " + l);
		l = cd.insertCastle(c);
		System.out.println("Inserted castle at id " + l);
		
		
		
	}
	
}
