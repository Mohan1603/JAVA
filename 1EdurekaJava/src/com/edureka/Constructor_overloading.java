package com.edureka;

class Constructor_overloading {
	int id;
	String name;
	int age;

	Constructor_overloading() {
		this(111, "rafa");
		System.out.println("Default Constructor");
	}

	Constructor_overloading(int i, String n) {
		System.out.println("Constructor 1");
		id = i;
		name = n;
	}

	Constructor_overloading(int i, String n, int a) {
		System.out.println("Constructor 2");
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		Constructor_overloading s1 = new Constructor_overloading();
		Constructor_overloading s2 = new Constructor_overloading(222, "nadal", 25);
		s1.display();
		s2.display();
	}
}
