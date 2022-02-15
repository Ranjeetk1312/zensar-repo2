package com.zensar;

public interface Vehicle {
	// all the member variables are final in interface
	int myFinalInt = 0;
	int speed = 0;

	public void show();

	// In interface, Only 3 type of methods are alloed
	// 1) Built-in or pre-defined methods
	// 2) abstract method
	// 3) static method

	public static void accelerate() {
		System.out.println("Vehicle is moving!!!");
	}

	public default void display() {
		System.out.println("Inside display method");
	}

	public static void method1() {
		System.out.println("Inside method1");
	}
}
