package com.luv2code.springdemo;

public class MyApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Coach coach= new BaseballCoach();
	Coach coach1= new TrackCoach();
	System.out.println(coach.dailyWorkout());
	System.out.println(coach1.dailyWorkout());
}

}
