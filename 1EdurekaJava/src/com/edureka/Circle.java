package com.edureka;

public class Circle extends AbstractShape{
	
	float area() {
		System.out.println("Hello");
		return 1.2f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractShape round=new Circle();
		//float areaofCircle=round.area();
		round.displayArea(round.area());		
	}
}