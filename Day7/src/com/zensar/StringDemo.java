package com.zensar;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literal or String variable
		String str = "Hello World"; // Directly assigning a String value to String reference variable - 
		//String literal declaration & Initialization  , this will be created in String constant pool
		
		//String Object declaration & Initialization
		String str1 = new String("Hello World"); // this will be created in heap area
		
		String str2; //Declaring an String object reference. str2 is a String reference variable
		//In line number 14, object will not be created
		//String objects, literals will be created in String pool area
		
		//All the objects will be created in heap area
		
		//reference variables are pointers - bcos it store memory address of object.
		new String("Welcome"); // Creating a new object in heap area which will not be accessible
		
		System.out.println("str hashcode =" + str.hashCode());
		System.out.println("str1 hashcode =" + str1.hashCode());
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		String str3 = "Welcome to JAVA World";
		System.out.println(str3);
		System.out.println("Hi Guys " + str3);
		
		System.out.println(str3);
		
		//Strings are sequence of character stored in an array
		String str4 = "MyString";
		
		for(int i=0;i<str4.length();i++) {
			System.out.println(str4.charAt(i));
		}
		
		System.out.println(str4.contains("b"));
		char data[] = str4.toCharArray();
		
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());
		
		System.out.println(str4.substring(2,8));
	}

}
