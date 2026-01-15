package com.Avi.main;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Avi.config.EmpConfiguration;
import com.Avi.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(10, "Shivam", "Male", 64548, "India");
		Employee emp2 = new Employee(11, "Vimla", "Female", 64548, "India");
		Employee emp3 = new Employee(12, "Keshav", "Female", 64548, "India");

		
	//	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	//	SessionFactory sessionFactory = cfg.buildSessionFactory();
	//	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//way1
	//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	//	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		//way2
	//	SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
		
		
		//metadata.buildSessionFactory();
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		tx.commit();
		
		
		Query<Employee> query = session.createQuery("from empp",Employee.class);
		System.out.println(query.list());
	//	Employee employee = session.get(Employee.class, 8);
	//	System.out.println(employee);
		
	//	Employee employee = session.find(Employee.class, 3);
	//	System.out.println(employee);
		
		//Employee employee = new Employee();
	//	session.load(employee, 5);
	//	System.out.println(employee);
	}
}
