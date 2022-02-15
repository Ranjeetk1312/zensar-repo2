package com.zensar;

import java.util.Objects;

public class StringBufferDemo {
	
	private int id;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld";
		StringBuffer strBuffer = new StringBuffer("HelloWorld");
		StringBuffer strBuffer2 = new StringBuffer(str);
		
		System.out.println(str.hashCode());
		System.out.println(strBuffer.hashCode());
		System.out.println(strBuffer2.hashCode());
		
		strBuffer.append("Welcome to JAVA");
		System.out.println(strBuffer);
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringBufferDemo other = (StringBufferDemo) obj;
		return id == other.id;
	}
	
	
	

}
