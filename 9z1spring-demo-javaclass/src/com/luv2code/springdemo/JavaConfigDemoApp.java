package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read the spring java class
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach theCoach= context.getBean("tennisCoach", Coach.class);
				
		//call the method bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();

	}

}
