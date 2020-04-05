package com.edureka;

public class Encapsulation {
	
	private String Name;
	
	public String getName() {
		return Name;
	}
	public void setname(String Name) {
		this.Name=Name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.setname("Nadal");
		System.out.println(e.getName());

	}

}
