package com.zensar;

import java.io.FileOutputStream;

public class TryWithReource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fileOutputStream = new FileOutputStream("e:\\zensar ii\\test.txt")) {
			String msg = "Welcome to Exception Handling!!!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
