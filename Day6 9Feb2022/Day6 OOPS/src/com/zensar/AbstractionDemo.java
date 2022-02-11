package com.zensar;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class MyAbstractClass {
	// method declaration - declaring & defining an empty method
	public void show() // method signature line
	{ // method body starts here

	}// method body ends here

	public abstract void display();
}
//It is possible to define an abstract class with out any abstract method in it.
abstract class SecondAbstract {
	public void display() {
		System.out.println("This is a concrete method");
	}
}
