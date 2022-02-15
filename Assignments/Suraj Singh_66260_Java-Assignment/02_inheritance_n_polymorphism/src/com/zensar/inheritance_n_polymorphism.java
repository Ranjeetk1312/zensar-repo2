package com.zensar;

public class inheritance_n_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Labour
        Labour Lq = new Labour();
		
		Lq.setEmployeeID(67);
		Lq.setEmployeeName("Amit");
		System.out.println(Lq.getEmployeeID());
		System.out.println(Lq.getEmployeeName());
		System.out.println(Lq.toString());
		
		System.out.println("The Total Salies of the Employees ::: " + Lq.addTotalSalaryOfEmployees(10000));
	
		// Manager 
		Manager Mg = new Manager();
		Mg.setEmployeeID(34);
		Mg.setEmployeeName("Suresh");
		System.out.println(Mg.getEmployeeID());
		System.out.println(Mg.getEmployeeName());
		System.out.println(Mg.toString());
		
		System.out.println("The Total Salies of the Employees ::: " + Mg.addTotalSalaryOfEmployees(19000));
		
		CurrentAccount Cg = new CurrentAccount();
		Cg.setCustomerAccountNumber("11565878");
		Cg.setCustomerName("Suresh");
		System.out.println(Cg.getCustomerAccountNumber());
		System.out.println(Cg.getCustomerName());
		System.out.println(Cg.getAmount(48903));
		System.out.println(Cg.toString());
		
		//System.out.println("The Total Salies of the Employees ::: " + Mg.addTotalSalaryOfEmployees(19000));
		
		
	}

}
