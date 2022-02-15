package com.zensar;

public class Empolyee {
	public String employeeName;
	public int employeeID;
	public static long salary;
	public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empolyee(String employeeName, int employeeID) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public long addTotalSalaryOfEmployees(int sal)
	{
		return salary += sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + employeeID + ", name=" + employeeName + "]";
	}
	
}
