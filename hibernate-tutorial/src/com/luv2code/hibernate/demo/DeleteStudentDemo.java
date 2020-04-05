package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			
			String id="1";
			
			//start a transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on Id
			System.out.println("\nGetting student with Id : "+ id);
			
			Student myStudent1= session.get(Student.class, id);
			
			System.out.println("Deleting student....");
			
			session.delete(myStudent1);
			//commit transaction
			session.getTransaction().commit();
			
			//delete using Query
			session=factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete from Student where id=1")
						.executeUpdate();
			System.out.println("Deleting student....");
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		}

	
		finally {
			factory.close();
		}
}

}
