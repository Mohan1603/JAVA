package com.edureka;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money m=new Debit();
		Currency m1=new Debit();
		Credit m2=new Credit();
		m.operation();
		m1.convert();
		m2.process();

	}

}
