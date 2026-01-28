package com.Avi.main;

import java.util.ArrayList;

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
import com.Avi.entity.Address;
import com.Avi.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		
//		Employee emp1 = new Employee(10, "Shivam", "Male", 64548, "India");
//		Employee emp2 = new Employee(11, "Vimla", "Female", 64548, "India");
//		Employee emp3 = new Employee(12, "Keshav", "Female", 64548, "India");

		
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
//		Session session = EmpConfiguration.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		tx.commit();
		
		
//		Query<Employee> query = session.createQuery("from empp",Employee.class);
//		System.out.println(query.list());
	//	Employee employee = session.get(Employee.class, 8);
	//	System.out.println(employee);
		
	//	Employee employee = session.find(Employee.class, 3);
	//	System.out.println(employee);
		
		//Employee employee = new Employee();
	//	session.load(employee, 5);
	//	System.out.println(employee);
		
		
		
		
		
		
		Employee emp1 = new Employee();
		emp1.setName("Vinay");
		emp1.setGender("M");
		emp1.setSalary(400000);

		Address add1 = new Address();
		add1.setCity("Noida");
		add1.setState("UP");
	
		Address add2 = new Address();
		add2.setCity("GZB");
		add2.setState("UP");
		
		Address add3 = new Address();
		add3.setCity("Lucknow");
		add3.setState("UP");
	
		
		
		ArrayList<Address> listOfAddresses = new ArrayList<>();
		listOfAddresses.add(add1);
		listOfAddresses.add(add2);
		listOfAddresses.add(add3);
		
		emp1.setAddresses(listOfAddresses);

		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	
		session.persist(emp1);
		tx.commit();
		
		
//		Employee employee = session.find(Employee.class, 1);
//		System.out.println(employee);
//		System.out.println(employee.getAddresses());
//		
//		Address address = session.find(Address.class, 2);
//		System.out.println(address);
//		System.out.println(address.getEmployee());
		
		
	}
}
