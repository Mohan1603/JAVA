package com.edureka;

public class Employee extends Method_Overriding_Inheritance{
	
	public void empSalary() {
		Salary=1000;
		System.out.println("Emp Salary: "+Salary);
		System.out.println(super.exm);
	}
	public void overriding_Example() {
		System.out.println("This is the Example Method Overriding(Runtime Polymorphism)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		emp= new Employee();
		emp.empSalary();
		
		Method_Overriding_Inheritance m=new Method_Overriding_Inheritance();
		m.Salary=10000;
		System.out.println("Manager Salary: "+m.Salary);
		
		m.overriding_Example();//Ex of Inheritace calling other class method
		
		Method_Overriding_Inheritance method=new Employee();
		method.overriding_Example();//method overriding(Dynamic Binding)
	}

}
