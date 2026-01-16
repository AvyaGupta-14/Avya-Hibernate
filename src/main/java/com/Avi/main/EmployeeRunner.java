package com.Avi.main;

import java.util.List;

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
		
		
<<<<<<< Updated upstream
		Employee emp1 = new Employee(10, "Shivam", "Male", 64548, "India");
		Employee emp2 = new Employee(11, "Vimla", "Female", 64548, "India");
		Employee emp3 = new Employee(12, "Keshav", "Female", 64548, "India");
		Employee emp4 = new Employee(13, "Kriti", "Female", 64548, "India");
=======
		Employee emp1 = new Employee(10, "Avya", "Female", 64548, "India");
		Employee emp2 = new Employee(11, "Nitin", "Female", 64548, "India");
		Employee emp3 = new Employee(12, "Neelam", "Female", 64548, "India");
		Employee emp4 = new Employee(12, "Jack", "Male", 64548, "India");
		Employee emp5 = new Employee(12, "Atharv", "Male", 64548, "India");
		Employee emp6 = new Employee(12, "Naitik", "Male", 64548, "India");
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
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
<<<<<<< Updated upstream
//		tx.commit();
		

		Query<Employee> query = session.createQuery("from empp",Employee.class);
		System.out.println(query.list());
=======
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
	//	Query q = session.createQuery("update empp set name=:n where id=:i");
		session.createMutationQuery("update empp set name=:n where id=:i");

		q.setParameter("n","Pankaj");
		q.setParameter("i",1);
		System.out.print("status: "+q.executeUpdate());
		
		tx.commit();

>>>>>>> Stashed changes
	//	Employee employee = session.get(Employee.class, 8);
	//	System.out.println(employee);
		
	//	Employee employee = session.find(Employee.class, 3);
	//	System.out.println(employee);
		
		//Employee employee = new Employee();
	//	session.load(employee, 5);
	//	System.out.println(employee);
	}
}
