package com.zensar;

public class Bank {
	private String customerAccountNumber;
	private String customerName;
	public static long amount;
	
	
	
	
	public Bank() {
		super();
	}
	public Bank(String customerAccountNumber, String customerName) {
		super();
		this.customerAccountNumber = customerAccountNumber;
		this.customerName = customerName;
	}
	public String getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(String customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAmount(long deposit) {
		// TODO Auto-generated method stub
		return amount;
	}
	
	
	@Override
	public String toString() {
		return "Customer [Account Number=" + customerAccountNumber + ", Customer Name=" + customerName + ", Amount=" + amount  +"]";
	}
	
	

}
