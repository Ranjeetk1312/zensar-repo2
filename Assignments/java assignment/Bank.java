package day4Assignments;

public class Bank {
	
	long bal = 100000;
	long minBalance = 5000;
	long maxTransAmount = 20000;
	
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
	
	
	

	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.depsoitAmount(4000);
		b.withdrawAmount(3000);

	}

}
