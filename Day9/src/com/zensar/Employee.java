package com.zensar;

import java.io.Serializable;

public class Employee implements Serializable{

	// member variables or state
	private int id;
	private String name;
	private float salary;
	private static String employmentType;
	private transient String PAN;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, float salary, String pAN) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		PAN = pAN;
	}

	public static String getEmploymentType() {
		return employmentType;
	}

	public static void setEmploymentType(String employmentType) {
		Employee.employmentType = employmentType;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// member methods or behaviors

}
