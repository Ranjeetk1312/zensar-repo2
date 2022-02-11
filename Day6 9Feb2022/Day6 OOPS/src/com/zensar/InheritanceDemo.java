package com.zensar;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent(); //creating parent object by calling default constructor with new keyword
		
		parent.age = 45;
		parent.mobile = 9867876745l;
		parent.salary = 25000.00f;
		parent.address = "Chennai";
		
		System.out.println("Parent = " + parent);
		
		System.out.println("parent is a reference variable/ pointer. It will store the address of Parent Object ");
		
		
		Parent obj1 ; //Just creating an object reference only not the actual object.
		
		obj1 = new Parent(); //Object will be created in heap memory and the memory address of the object is passed to obj1 reference variable
	
		obj1.display();
		
		Child child1 = new Child();
		child1.address = "Delhi";
		child1.age =25;
		child1.mobile = 7867897856l;
		child1.salary = 45000.00f;
		child1.display();
		
		GrandChild grandChild1 = new GrandChild();
		grandChild1.display();
	}

}
