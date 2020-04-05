package com.edureka;

public class Helloworld {

	
	 int a=20;
	 static int c=30;
	 static int f=30;
	
	public synchronized void nonststic()
	{
		int b='g'; 
		int v=a;
		System.out.println("Non static method "+v+" "+f+" "+b);
	}
	public static void staticmethod()
	{
		c=50;
		System.out.println(c+" "+f);
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!");
		Helloworld nonstaticobject=new Helloworld();
		nonstaticobject.a=10000;
		Helloworld.c=60;
		System.out.println(c);
		nonstaticobject.nonststic();
		staticmethod();
		
	}

}
