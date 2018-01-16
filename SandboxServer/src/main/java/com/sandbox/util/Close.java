package com.sandbox.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Close {

	public static void close(Session session) {
		try { 
			if(session != null)
				session.close(); 
		}
		catch(HibernateException e)  {
			e.printStackTrace();
		}
	}

	public static void close(SessionFactory sf) {
		try {
			if(sf != null)
				sf.close();
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
	}

	public static void close(FileInputStream fis) {
		try { 
			if(fis != null)
				fis.close(); 
		}
		catch(IOException e)  {
			e.printStackTrace();
		}
	}

	public static void close(FileOutputStream fos) {
		try { 
			if(fos != null)
				fos.close(); 
		}
		catch(IOException e)  {
			e.printStackTrace();
		}
	}
	public static void close(Workbook workbook) {
		try {
			if(workbook != null)
				workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
