package com.zensar;

public class Car implements Vehicle {

	//Empty method 
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.show();
		c1.display();
		Vehicle.accelerate();
		Vehicle.method1();
	}
}
