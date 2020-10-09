package com.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FactoryProvider {
	
	public static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		
		if(factory==null) {
			factory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return factory;
	}
	public void closeFactory() {
		factory.close();
	}
}
