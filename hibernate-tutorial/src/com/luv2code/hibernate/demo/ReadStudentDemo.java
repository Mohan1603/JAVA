package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

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
				System.out.println("Creating new student object...");
				Student tempStudent= new Student("andy", "murray", "andy@gmail.com");
				
				//start a transaction
				session.beginTransaction();
				
				//save the student object
				System.out.println("Saving the Student...");
				System.out.println(tempStudent);
				session.save(tempStudent);
				
				//commit transaction
				session.getTransaction().commit();
				
				//READ OBJECTS
				
				//find out the student Id's Primary key
				System.out.println("Generated Id is: "+ tempStudent.getId());
				
				//get a session to start a transaction
				session=factory.getCurrentSession();
				session.beginTransaction();
				
				//retrieve student based on Id
				System.out.println("\nGetting student with Id : "+ tempStudent.getId());
				
				Student myStudent= session.get(Student.class, tempStudent.getId());
				
				System.out.println("Get complete"+ myStudent);
				
				//commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done");
			}

		
			finally {
				factory.close();
			}
	}

	}


