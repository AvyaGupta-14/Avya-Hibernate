package com.Avi.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Avi.config.EmpConfiguration;
import com.Avi.entity.Address;
import com.Avi.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		

		Employee emp1 = new Employee("Shivam", "Male", 64548);
		Address add1 = new Address("Noida","UP");
		
		emp1.setAddress(add1);

	//	Employee emp = new Employee(9, "Ritu", "Female", 	64548, "India");

	//	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	//	SessionFactory sessionFactory = cfg.buildSessionFactory();
	//	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//way1
	//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	//	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		//way2
//		SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
	
		
		//metadata.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(add1);
		session.persist(emp1);
		tx.commit();
		
	//	Employee employee = session.get(Employee.class, 8);
	//	System.out.println(employee);
		
	//	Employee employee = session.find(Employee.class, 3);
	//	System.out.println(employee);
		
		//Employee employee = new Employee();
	//	session.load(employee, 5);
	//	System.out.println(employee);
	}
}
