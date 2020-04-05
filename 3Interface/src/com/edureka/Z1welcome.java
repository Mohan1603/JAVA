package com.edureka;

public interface Z1welcome {
	default void say() {
		System.out.println("Welcome to edureka");//Java-8 allows default & static
	}
	void hello(String msg1);
	static void display() {
		System.out.println("Static method in Interface");
	}

}
