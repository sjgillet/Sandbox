package com.sandbox.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sandbox.model.Castle;
import com.sandbox.util.HibernateUtil;

import static com.sandbox.util.Close.close;

public class CastleDao {

	private static CastleDao cd;
	
	public static CastleDao getCastleDao() {
		if(cd == null)
			cd = new CastleDao(); 
		return cd; 
	}
	
	private CastleDao() {
		
	}
	
	
	public Long insertCastle(Castle c) {
		Session session = HibernateUtil.getSession(); 
		Transaction tx = session.beginTransaction();
		Long id = (Long)session.save(c); 
		tx.commit(); 
		close(session); 
		
		return id;
	}
	
	
	
	
}
