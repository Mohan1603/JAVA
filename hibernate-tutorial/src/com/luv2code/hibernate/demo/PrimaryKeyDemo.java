package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			//use the session object to save the java object
			System.out.println("Creating 3 student objects...");
			Student tempStudent1= new Student("nadal", "rafa", "nadal@gmail.com");
			Student tempStudent2= new Student("roger", "fed", "roger@gmail.com");
			Student tempStudent3= new Student("nova", "djok", "nova@gmail.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the Student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		}

	
		finally {
			session.flush();
			session.close();
			factory.close();
		}
    }

	}


