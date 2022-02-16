package com.zensar;

import java.util.ArrayList;
import java.util.List;

public class NumberListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List numberList = new ArrayList();
		
		numberList.add(5);
		int i=25;
		numberList.add(i); //Auto Boxing is happening
		numberList.add(75);
		numberList.add(25);
		numberList.add(5);
		numberList.add(10);
		numberList.add(25);
		
		//Collections will not operate with primitive
		System.out.println(numberList);
		
		//Auto-Boxing - IS the process of converting primitive to it's corresponding object representation automatically
		
		//Manual Boxing
		int x= 100; //primitive integer variable
		Integer intObj = new Integer(x); //manual boxing 
		System.out.println(intObj.intValue());
		
		String str = "200";
		Integer intString = new Integer(str);
		System.out.println(intString); //Auto-Unboxing here
		
		Employee emp = new Employee();
		System.out.println(emp);
		
		System.out.println( Integer.toBinaryString(x));
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Long.BYTES);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		
		//intObj == intObj.intValue()
		
		numberList.forEach(System.out::println);
		
		
	}

}
