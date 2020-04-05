package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAppDemo {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach= context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.dailyWorkout());
		
		System.out.println(theCoach.dailyFortune());
		
		//call our new setter methods to get literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeamName());
		//close the context
		context.close();


	}

}
