package com.Avi.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

//import com.mysql.cj.xdevapi.SessionFactory;

public class EmpConfiguration {
	
	public static SessionFactory getSessionFactory()
	{
		Properties properties = new Properties();
		
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/hibernate");
		properties.put(Environment.JAKARTA_JDBC_USER, "root");
		properties.put(Environment.JAKARTA_JDBC_PASSWORD, "Avya@14");
		properties.put(Environment.HBM2DDL_AUTO, "create");
		properties.put(Environment.SHOW_SQL, "true");
		//properties.put(Environment.FORMAT_SQL, "true");
		
	//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
	//	Metadata metaData = new MetadataSources(ssr).addAnnotatedClass(com.Avi.entity.Employee.class).getMetadataBuilder().build();
	//	SessionFactory sessionFactory = metaData.buildSessionFactory();


	//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(properties).build()).addAnnotatedClass(com.Avi.entity.Employee.class).getMetadataBuilder().build().buildSessionFactory();
	//	return metaData.buildSessionFactory();
		
	//	return sessionFactory;
	}

}
