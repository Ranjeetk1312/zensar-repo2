package com.zensar;

//Non-Starter concrete bean class
public class Employee {

	// Member properties - State
	private int id;
	private String name;
	private String email;
	private long mobile;

	// Constructor - Default - No Argument constructor
	// Constructor is a special method which will not return any values and it wont
	// have void keyword
	// Constructor - To Initialize all the member variable/ properties/ state
	// If not defined, jvm will automatically add the default/no-arg constructor.
//	public Employee() {
//		
//	}

	// Default / No-Argument Constructor
	public Employee() {
		super();
	}

	// Parameterized -Fully & Partially
	// fully parameterized / All Argument Constructor
	public Employee(int id, String name, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public Employee(String name, String email, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

	
}
