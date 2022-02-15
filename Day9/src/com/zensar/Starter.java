package com.zensar;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Test");
		emp.setSalary(24000.00f);
		
		Employee emp1 = new Employee(101, "ABC", 15000f);
		
		System.out.println(emp);
		System.out.println(emp1);
	}

}
