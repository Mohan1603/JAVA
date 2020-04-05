package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field for dependency
	private FortuneService fortuneService;
	
	//default constructor for MyApp.java
	public BaseballCoach() {}
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
	@Override
	public String dailyWorkout() {
		return "Spend 30 mins for Baseball workout";
	}

	@Override
	public String dailyFortune() {
		//use my fortune service to get fortune
		return fortuneService.getFortune();
	}

}
