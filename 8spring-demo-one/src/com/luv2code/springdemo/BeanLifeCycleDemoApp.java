package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.dailyWorkout());
		System.out.println(theCoach.dailyFortune());
		
		//close the context
		context.close();

	}

}
