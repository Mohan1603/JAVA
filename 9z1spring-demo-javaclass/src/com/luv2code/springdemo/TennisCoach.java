package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	//inject properties file
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	//Field-injection done by Autowired, applied directly to the field
	@Autowired  
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Inside default constructor");
	}

	/*
	 * //Autowired setter-injection
	 * 
	 * @Autowired
	 * @Qualifier("happyFortuneService") public void
	 * setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">> Tennis Coach: inside setter method");
	 * System.out.println(email); System.out.println(team); this.fortuneService =
	 * fortuneService; }
	 */

	/*
	 * //Autowired constructor-injection
	 * 
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 * 
	 */
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define my init-method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> Tennis Coach: inside doMyStartupStuff");
	}
	
	//define my Destroy-method
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println(">> Tennis Coach: inside doMyDestroyStuff");
	}
}
