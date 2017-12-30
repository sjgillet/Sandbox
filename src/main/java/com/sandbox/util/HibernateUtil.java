package com.sandbox.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	@SuppressWarnings("deprecation")
	private static SessionFactory sessFact = new Configuration().configure().buildSessionFactory(); 
	
	public static Session getSession() {
		return sessFact.openSession();
	}
	
	
}
