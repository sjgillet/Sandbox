package com.sandbox.driver;

import java.util.ArrayList;

import com.sandbox.beans.Castle;
import com.sandbox.beans.Troop;
import com.sandbox.dao.CastleDao;

public class Driver {

	public static void main(String[] args) {
		CastleDao cd = CastleDao.getCastleDao(); 
		
		Castle youngCastle = new Castle(
				"Einfort", "The Newcomers", 1000, new ArrayList<Troop>()
				);
		
		Troop soldier1 = new Troop("Caldwell", "At your service!", 10);
		Troop soldier2 = new Troop("Harken", "At your service, sir!", 10);
		Troop soldier3 = new Troop("Mark", "Yes, sir!", 10);
		ArrayList<Troop> garrison = new ArrayList<>();
		garrison.add(soldier1); 
		garrison.add(soldier2); 
		garrison.add(soldier3);
		
		Castle oldTown = new Castle("Castle at Old Town", "Knights of the Round", 20000, garrison); 
		
		
		
	}

}
