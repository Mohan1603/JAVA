package com.edureka;

public class Empinfo{
	
	int id;
	Name name;
	
	Empinfo(int id, Name name){
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Emp id is "+id);
		System.out.println("Name is "+name.first+" "+name.last);
	}

	public static void main(String[] args) {
		Name name=new Name("Alex","Mohan");
		Empinfo em=new Empinfo(1,name);
		em.display();
	}
}