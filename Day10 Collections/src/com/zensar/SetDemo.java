package com.zensar;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set numberSet = new HashSet();
		numberSet.add(10);
		numberSet.add(7);
		numberSet.add(50);
		numberSet.add(30);
		numberSet.add(30);
		numberSet.add(20);
		numberSet.add(15);
		numberSet.add(17);
		
		System.out.println(numberSet);
		
		Set orderedSet = new TreeSet();
		orderedSet.add(100);
		orderedSet.add(70);
		orderedSet.add(10);
		orderedSet.add(20);
		orderedSet.add(35);
		orderedSet.add(15);
		orderedSet.add(25);
		orderedSet.add(27);
		orderedSet.add(16);
		orderedSet.add(101);
		orderedSet.add(708);
		orderedSet.add(16);
		orderedSet.add(1010);
		
		System.out.println(orderedSet);
		
		Set orderedNames = new TreeSet();
		orderedNames.add("Sundar");
		orderedNames.add("Satya");
		orderedNames.add("Mark");
		orderedNames.add("James");
		
		System.out.println(orderedNames);
		
	}

}
