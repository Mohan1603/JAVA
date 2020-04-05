package com.edureka;

public class Debit implements Money,Currency{
	public void operation() {
		System.out.println("Amount has been Debited");
	}
	public void convert() {
		System.out.println("Convert from usd to inr");
	}

}
