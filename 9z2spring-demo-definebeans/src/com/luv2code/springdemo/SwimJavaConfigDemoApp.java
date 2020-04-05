package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read the spring java class
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		//to get the newly implemented sports.properties file change Coach interface to Swimcoach class
		SwimCoach theCoach= context.getBean("swimCoach", SwimCoach.class);
				
		//call the method bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods...
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Team: "+theCoach.getTeam());
		//close the context 
		context.close();

	}

}
