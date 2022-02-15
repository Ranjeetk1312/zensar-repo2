package com.zensar;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("e:\\zensar ii\\raf.txt");
		f.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeChars("Sample content");
		System.out.println("Completed file write operation");
		
		 StringBuffer buffer = new StringBuffer();
		 
		 while(raf.getFilePointer() < raf.length()) {
	         buffer.append(raf.readLine()+System.lineSeparator());
	      }
	      String contents = buffer.toString();
	      System.out.println("Contents of the file: \n"+contents);
//		while(raf.readChar()!='\0') {
//			System.out.println(raf.readLine());
//		}

	}

}
