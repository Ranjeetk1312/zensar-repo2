package com.zensar;

public class SingletonClass {
	
	private static SingletonClass instance = null;
	public String str;
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance() {  
		if (instance == null){  
		instance = new SingletonClass();  
		}  
		return instance;  
		  
		}  
	
}
