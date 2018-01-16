package com.sandbox.dao;

import static com.sandbox.util.Close.close;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sandbox.model.Troop;
import com.sandbox.util.HibernateUtil;

public class TroopDao {

	private static TroopDao td;
	
	public static TroopDao getTroopDao() {
		if(td == null)
			td = new TroopDao(); 
		return td;
	}
	
	private TroopDao() {
		
	}
	
	public Long insertTroop(Troop t) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Long id = (Long) session.save(t); 
		tx.commit();
		close(session); 
		return id; 
	}
	
	public Troop getTroopByName(String name) {
		Session session = HibernateUtil.getSession();
		String hql = "FROM Troop where troop_name = :name";
		Query query = session.createQuery(hql); 
		query.setParameter("name", name); 
		Troop t = (Troop)query.uniqueResult();
		return t; 
	}
	
}
