package com.zensar;

public class Account {
	
	private int amount;

	public Account(int amount) {
		super();
		this.amount = amount;
	}
	
	public int withdraw(int amount)
	{
		return this.amount -= amount;
		
	}
	
	public int deposit(int amount)
	{
		return this.amount += amount;
	}
	
	public void display()
	{
		System.out.println("The Balance left in Account : " + this.amount);
	}
	
	public void display(int amount)
	{
		System.out.println("The Balance left in Account : " + amount);
	}

}
