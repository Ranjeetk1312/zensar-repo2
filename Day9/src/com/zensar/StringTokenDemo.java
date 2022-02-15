package com.zensar;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World!!! Welcome to JAVA World, Splitting the String using StringTokenizer.";
		StringTokenizer stringToken = new StringTokenizer(str, ",");
		while(stringToken.hasMoreTokens()) {
			System.out.println(stringToken.nextToken());
		}
	}

}
