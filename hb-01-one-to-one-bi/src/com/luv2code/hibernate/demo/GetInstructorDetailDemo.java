package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			
			//start a transaction
			session.beginTransaction();
			
			//get instructor by id
			int id=2;
			InstructorDetail tempInstructor=session.get(InstructorDetail.class, id);
			System.out.println("Printing the InstructorDetails..."+tempInstructor);
			
			if (tempInstructor !=null) {
				
				//it will also delete the instructor details(cascade)
			System.out.println("Printing the Associated Instructor..."
				+tempInstructor.getInstructor());
			}
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	
		finally {
			session.close();
			factory.close();
		}
}

}
