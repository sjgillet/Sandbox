package com.sandbox.dao;

import com.sandbox.beans.Castle;

public class SandboxDao {
	
	private SandboxDao sbd;
	
	public SandboxDao getSandboxDao() {
		if(sbd == null)
			sbd = new SandboxDao();
		return sbd; 
	}
	
	private SandboxDao() { }

	public Castle getCastleById(int castleId) { 
		
		
		return null; 
	}
	
	public int insertCastle(Castle c) {
		
		
		
		return 0; 
	}
	
}
