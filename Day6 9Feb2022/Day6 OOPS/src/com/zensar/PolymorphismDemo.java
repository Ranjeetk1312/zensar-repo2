package com.zensar;

public class PolymorphismDemo {

	public static void main(String[] args) {
		PolymorphismDemo obj = new PolymorphismDemo();
		//static or compile time polymorphism -- method overloading
		obj.add(5, 8);
		obj.add(2.987f, 6.875f);
		obj.add(9.453f, 25);
		obj.add(75, 4.5454f);
		obj.add(4, 6, 5);
		
		Class1 obj1 = new Class1();
		obj1.display();
		
		Class2 obj2 =new Class2();
		obj2.display();
		
		Class1 obj3 = new Class2();
		obj3.display();
		
//		Class2 obj4 = new Class1();
		
		
	}

	public void add(int a, int b) {
		System.out.println("result of two int addition is =" + (a + b));
	}

	// by changing signature we can reuse existing method
	// method name, no of arguments, return type & access modifier
	public void add(int a, int b, int c) { // no of argument is different
		System.out.println("result of three int addition is =" + (a + b + c));
	}

	// method overloading
	public void add(int a, float b) {
		System.out.println("result of int, float addition is =" + (a + b));
	}

	// method overloading
	public void add(float a, float b) {
		System.out.println("result of two float addition is =" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("result of float, int addition is =" + (a + b));
	}
}
