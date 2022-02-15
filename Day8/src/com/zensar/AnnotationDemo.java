package com.zensar;

import java.util.Date;

public class AnnotationDemo {

	@MyAnnotation
	private int id;
	private String name;
	
	public AnnotationDemo() {
		super();
	}

	public AnnotationDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "AnnotationDemo [id=" + id + ", name=" + name + "]";
	}
	//parameterized annotation
	@SuppressWarnings("unused")
	//@Deprecated //This annotation is used to deprecate any method and inform it to the compiler/jvm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationDemo obj1 = new AnnotationDemo();
		obj1.toString();
		
		int a =20;
		int b= 45;
		
		Date today = new Date(122, 1, 14);
		
	}

}
