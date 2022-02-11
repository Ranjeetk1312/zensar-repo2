package com.zensar;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		byte myByte = 120;
		short myShort = 350;
		char myChar = 'a';
		int decimal = 34567;
		int binary = 0B010010;
		int hexa = 0x1239AdF;
		int octal = 01562;
		float myFloat = 8.786f;
		double myDouble = 78.676824;
		long mobile = 9089785623l;
		
		//Declaring & Initializing a variable
		// declration = definition - defining a variable and it's data type before using it
		//Initialization = assigning a value to the declared variable
		//Declare & assign the value (both the operation can be performed in a single line)
		
		int myInt; //variable declaration/definition
		myInt= 250;
		System.out.println("myInt value is =" + myInt);
		//before using any variable, it needs to be initialized
		
		String str = null;
//		myInt = null;
		
		
		Employee emp = null;
		//emp reference variable is not pointing to any object 
		emp = new Employee();
		
		System.out.println("Printing emp object reference :"+emp);
		System.out.println("Printing emp object hashCode :"+emp.hashCode());
		
		//variable declaration syntax =>   <primitive_data_type> <variable_name>;
		//Object creation syntax
		// <Class_name> <obj_reference> ; == Object reference creation/declaration
		//obj_reference = new <Class_name>();
		
		Employee employee; //employee is a reference variable - It's not an object
		employee = new Employee(); //employee object will be created in heap area and the dummy address of the object will 
		//passed to employee reference variable
		
		System.out.println("Printing employee object reference :"+employee);
		System.out.println("Printing employee object hashCode :"+employee.hashCode());
		
		
	}

}
