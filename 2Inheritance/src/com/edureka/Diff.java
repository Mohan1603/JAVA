package com.edureka;

interface A{
	default void fun() {
		System.out.println("a");
	}
	
}
interface B{
	default void fun() {
		System.out.println("b");
	}
	
}
class C implements B,A{

	@Override
	public void fun() {
}
}
public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.fun();
		

	}

}
