package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	//Create an Array of strings
	private String[] data= {"Welcome", "Hello", "Cheers!!"};
	
	//Create random number generator
	private Random myRandom= new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array
		//int index= myRandom.nextInt(data.length);
		
		//String theFortune= data[index];
		return data[myRandom.nextInt(data.length)];
	}

}
