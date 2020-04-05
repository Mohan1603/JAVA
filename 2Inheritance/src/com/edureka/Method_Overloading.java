package com.edureka;

public class Method_Overloading {
	
	public void area(int l, int b)
	{
		System.out.println("Area of  rect is: "+(l*b));
	}
	public void area(int r)
	{
		System.out.println("Area of  circle is: "+(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading m=new Method_Overloading();
		m.area(5);
		m.area(4, 5);

	}

}
