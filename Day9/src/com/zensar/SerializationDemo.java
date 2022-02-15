package com.zensar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\zensar ii\\serial.txt"));
		Employee emp = new Employee(1000, "XYZ", 25000f, "GHOPS3456G");
		oos.writeObject(emp);
		System.out.println("Completed Serialization Successfully!!!");
	}

}
