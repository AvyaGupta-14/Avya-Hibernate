package com.Avi.main;

import java.util.List;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Avi.config.EmpConfiguration;
import com.Avi.entity.Employee;

public class EmployeeRunner {
	
//	public static void delById(int id,Session session)
//	{
//		// HQL delete query
//		MutationQuery query = session.createMutationQuery("delete from empp where id=:id");
//		query.setParameter("id",id);
//		query.executeUpdate();
//	}

	public static void main(String[] args) {
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		Employee emp1 = new Employee(10, "Avya", "Female", 64548, "India");
//		Employee emp2 = new Employee(11, "Nitin", "Female", 64548, "India");
//		Employee emp3 = new Employee(12, "Neelam", "Female", 64548, "India");
//		Employee emp4 = new Employee(12, "Jack", "Male", 64548, "India");
//		Employee emp5 = new Employee(12, "Atharv", "Male", 64548, "India");
//		Employee emp6 = new Employee(12, "Naitik", "Male", 64548, "India");

		
<<<<<<< Updated upstream
=======

		Employee emp = new Employee(8, "Renu", "Female", 64548);

	//	Employee emp = new Employee(9, "Ritu", "Female", 64548, "India");

>>>>>>> Stashed changes
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
//		session.persist(emp4);
//		session.persist(emp5);
//		session.persist(emp6);
	//	tx.commit();
		
		//Example of hql to get all the records
	//	Query query1 = session.createQuery("from empp",Employee.class);
//		List list = query1.list();
//		System.out.println(list);
		
		
		//HQL to get record with pagination
//		query1.setFirstResult(2);
//		query1.setMaxResults(5);
//		System.out.println(query1.list());
		
//		Query q = session.createQuery("select max(name) from empp");
//		List list1=q.list();
//		System.out.println(list1);
		
		
		//HQL update query using named parameters
//		Query q = session.createQuery("update empp set name=:n where id=:i");
//		MutationQuery mutationQuery = session.createMutationQuery("update empp set name=:n where id=:i");
//
//		mutationQuery.setParameter("n","Pankaj");
//		mutationQuery.setParameter("i",4);
//		System.out.print("status: "+mutationQuery.executeUpdate());
//		
		
	// HQL delete query
//		MutationQuery query = session.createMutationQuery("delete from empp where id=15");
//		query.executeUpdate();
//		
//		Query query1=session.createQuery("from empp",Employee.class);
//		List list = query1.list();
//		System.out.println(list);

		// Named query
//		MutationQuery namedQuery = session.createNamedMutationQuery("updateAnEmployee");
//		namedQuery.setParameter("n", "Karan");
//		namedQuery.setParameter("i", 13);
//		namedQuery.executeUpdate();
		
		MutationQuery namedQuery = session.createNamedMutationQuery("deleteEmployeeById");
		namedQuery.setParameter("i", 12);
		namedQuery.executeUpdate();

		tx.commit();

		Query query1 = session.createQuery("from empp", Employee.class);
		List list = query1.list();
		System.out.println(list);


	//	Employee employee = session.get(Employee.class, 8);
	//	System.out.println(employee);
		
	//	Employee employee = session.find(Employee.class, 3);
	//	System.out.println(employee);
		
		//Employee employee = new Employee();
	//	session.load(employee, 5);
	//	System.out.println(employee);
	}
}
