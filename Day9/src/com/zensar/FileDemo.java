package com.zensar;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("e:\\zensar ii\\sample.txt");
		System.out.println(file.isFile());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.createNewFile());
	}

}
