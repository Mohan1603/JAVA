package com.edureka;

public class Obj_init_by_method
{
int id;
String name;

void details(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String[] args)
{
	Obj_init_by_method s1=new Obj_init_by_method();
	Obj_init_by_method s2=new Obj_init_by_method();
s1.details(101,"rafa");
s2.details(102,"nadal");
s1.display();
s2.display();
}
}