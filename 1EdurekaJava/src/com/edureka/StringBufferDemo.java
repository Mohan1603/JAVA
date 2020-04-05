package com.edureka;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Welcome to Edureka!!");
		s.append("Happy Learning");
		
		System.out.println(s.replace(0, 5, "Entry"));
		s.insert(0, "Hello ");
		System.out.println(s);
		System.out.println(s.reverse());
		System.out.println(s.capacity());

	}

}
