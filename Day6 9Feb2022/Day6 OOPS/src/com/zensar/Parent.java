package com.zensar;

public class Parent {
	// instance variables
	private int id; // private member
	private String name; // private member
	int age; // default/package member
	long mobile; // default/package member
	protected float salary; // protected member
	protected String address; // protected member

	// method - Is a function defined/declared inside a class
	public void display() {
		System.out.println("This is parent display method");
	}

}
