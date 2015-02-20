package com.turesuelve.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		Usuario student = new Usuario();
		
		student.setNombre("Andre3");
				
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close(); //En create-drop mode, esto permite crear el esquema.
		//sessionFactory.close(); Si estas en create-drop, esto le indica a hibernate q dropea el esquema sin insertar nada. 
		
	}
}
