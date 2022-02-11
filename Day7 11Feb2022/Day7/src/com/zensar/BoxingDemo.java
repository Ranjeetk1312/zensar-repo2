package com.zensar;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10; //x is a integer variable with the value 10
		//integer variable declaration & initialization
		
		System.out.println("primitive int = " + x);
		
		Integer intObject = new Integer(x); //auto boxing happens here
		
		System.out.println("intObject =" + intObject); //Auto-Unboxing happens.
		
		Employee emp = new Employee();
		System.out.println("empObj =" + emp);
	}

}
