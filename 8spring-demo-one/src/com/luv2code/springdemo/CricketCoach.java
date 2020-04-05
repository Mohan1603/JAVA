package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields like email address and team name
	private String emailAddress;
	private String teamName;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("Inside setter method - setTeamName");
		this.teamName = teamName;
	}

	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String dailyWorkout() {
		return "Bowling practice for 30 mins";
	}

	@Override
	public String dailyFortune() {
		//return fortuneService.getFortune();
		return fortuneService.getPractice();
	}

}
