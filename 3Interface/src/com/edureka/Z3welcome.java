package com.edureka;

public interface Z3welcome {
	default void say() {
		sayhello();//private method can only call inside the interface
	}
	private void sayhello() {
		System.out.println("I'm privated");
	}

}
