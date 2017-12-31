package com.sandbox.dao;

import com.sandbox.beans.Castle;

public class CastleDao {
	private static CastleDao cd; 
	
	public static CastleDao getCastleDao() {
		if(cd == null) 
			cd = new CastleDao();
		return cd; 
	}
	private CastleDao() {
		
	}
	
	public int insertCastle(Castle c) {
		
		return 0;
	}
	
	public Castle getCastleById(int id) {
		
		return null; 
	}

}
