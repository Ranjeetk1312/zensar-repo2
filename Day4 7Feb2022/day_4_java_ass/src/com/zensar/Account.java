package com.zensar;

public class Account {
	
	long bal = 240000;
	long minBalance = 1000;
	long maxTransAmount = 35000;
	
	void depsoitAmount(int amount)
	{
		if(! (amount<maxTransAmount))
			System.out.println("reduce your amount for deposit ");
		
		bal += amount;
		
		System.out.println("New Balance " +  bal);
		
	}
	
	void withdrawAmount(int amount)
	{
		if((amount>maxTransAmount))
			System.out.println("reduce your amount for withdraw");
		
		long tempBal = bal - amount;
		
		if((tempBal<minBalance))
			System.out.println("cannot withdraw");
		
		bal = tempBal;
		
		System.out.println("New Balance " +  bal);	
			
	}


	public static void main(String[] args)
	{
		Account a = new Account();
		
		a.depsoitAmount(500);
		a.withdrawAmount(2000);

	}

}
