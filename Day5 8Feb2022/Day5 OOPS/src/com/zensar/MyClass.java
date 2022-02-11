package com.zensar;

import java.util.Date;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to JAVA World!!!");
		Date today = new Date();
		//Fully Qualified Name - Mentioning the class name along with it's package name
		java.sql.Date mySqlDate = new java.sql.Date(122, 1, 8);
		System.out.println("Today date is :" + today); // String concatenation 
		System.out.println("MySQL Date :" + mySqlDate);
		
	}

}

final class A {
	
}

abstract class B {
	
}
