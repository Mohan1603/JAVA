package com.edureka;

public class Calculator {
	
	public int add(int arg1, int arg2)
	{
		int result= arg1+arg2;
		return result;
	}
	public int add(int arg1, int arg2, int arg3)
	{
		int result= arg1+arg2+arg3;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal= new Calculator();
		float f=cal.add(20, 30);
		float s=cal.add(20, 30, 40);
		System.out.println(f);
		System.out.println(s);

	}

}
