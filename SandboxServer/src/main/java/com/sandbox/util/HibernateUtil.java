package com.sandbox.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static com.sandbox.util.Close.close;

public class HibernateUtil {
	private static SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
	
	public static Session getSession() {
		return sf.openSession();
	}
	
	
	public static void closeFactory() {
		close(sf); 
	}


	
}
