package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
			
			//create session factory
			SessionFactory factory= new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
			//create session
			Session session=factory.getCurrentSession();
			
			try {
				
				//start a transaction
				session.beginTransaction();
				
				//query students
				List<Student> theStudents= session.createQuery("from Student").list();
				
				//display student with method(converted for loop)
				displayStudents(theStudents);
				
				//query students with last name
				theStudents= session.createQuery("from Student s where s.lastName='wall'").list();
				
				//display student with method(converted for loop)
				System.out.println("\nStudents who have lastName has wall");
				displayStudents(theStudents);
				
				//query students with last name or first name 
				theStudents= session.createQuery("from Student s where" 
								+ " s.lastName='wall' OR s.firstName='nadal'").list();
				
				//display student with method(converted for loop)
				System.out.println("\nStudents who have lastName has wall or first name has nadal");
				displayStudents(theStudents);
				
				
				//query students with email
				theStudents= session.createQuery("from Student s where" 
								+ " s.email LIKE '%gmail.com'").list();
				
				//display student with method(converted for loop)
				System.out.println("\nStudents who have gmail.com");
				displayStudents(theStudents);
				
				
				//commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done");
			}

		
			finally {
				factory.close();
			}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
		System.out.println(tempStudent);
		}
	}

	}


