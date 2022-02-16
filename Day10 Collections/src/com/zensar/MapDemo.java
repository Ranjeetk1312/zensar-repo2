package com.zensar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> isdCodes = new HashMap<Integer,String>();
		isdCodes.put(91, "India");
		isdCodes.put(94, "Srilanka");
		isdCodes.put(96, "Singapore");
		isdCodes.put(971, "UAE");
		isdCodes.put(1, "USA");
		
		System.out.println(isdCodes);
		
//		isdCodes.clear();
		
		System.out.println(isdCodes.isEmpty());
		
		System.out.println(isdCodes.get(96));
		
		System.out.println(isdCodes.containsKey(100));
		
		System.out.println(isdCodes.containsValue("USA"));
		
		
//		traversing a map
		Set keys = isdCodes.keySet();
		
		for (Object object : keys) {
			System.out.println("ISDCODE = " + object + " Country Name = "+isdCodes.get(object));
		}
		
	}

}
