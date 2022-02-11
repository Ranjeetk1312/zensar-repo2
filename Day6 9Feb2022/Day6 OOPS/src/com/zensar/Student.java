package com.zensar;

public class Student {

	private int id;
	private String name;
	private String email;
	private long mobile;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public Student(String name, String email, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Student(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

}
