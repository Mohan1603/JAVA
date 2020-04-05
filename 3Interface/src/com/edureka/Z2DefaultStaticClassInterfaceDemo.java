package com.edureka;

public class Z2DefaultStaticClassInterfaceDemo implements Z1welcome{
	
	public void hello(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z2DefaultStaticClassInterfaceDemo out=new Z2DefaultStaticClassInterfaceDemo();
		out.say();
		out.hello("Happy learning");
		Z1welcome.display();//static method in interface, don't need an obj to call static method
	}

}
