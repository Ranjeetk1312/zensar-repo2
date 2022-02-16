package com.zensar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List nameList = new ArrayList();
		
		nameList.add("ABC");
		nameList.add("XYZ");
		nameList.add(1,"Sundar"); //insert the data in any available index of the collection - it shifts other elements to the right
		nameList.add("Satya");
		nameList.add("Mark");
		nameList.add("Elon");
		
		//iterating over a collection using forEach
		nameList.forEach(System.out::println);
		
		//displaying the content of collection
		System.out.println(nameList);
		
		System.out.println("Size of namelist :" + nameList.size());
		
		//iterating over a collection using iterator
		Iterator itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Arraylist is dynamically growing array");
		
		//iterating over a collection using enhanced for loop
		for (Object obj : nameList) {
			System.out.println(obj);
		}
		
//		nameList.
	}

}
