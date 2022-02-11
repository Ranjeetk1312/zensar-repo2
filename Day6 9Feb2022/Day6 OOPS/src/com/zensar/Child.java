package com.zensar;

public class Child extends Parent {
	private String childName;
	
	//overridden method - redefining the same method which is already defined in the parent class
	//method overriding
	public void display() {
		System.out.println("This is child display method");
	}
}
