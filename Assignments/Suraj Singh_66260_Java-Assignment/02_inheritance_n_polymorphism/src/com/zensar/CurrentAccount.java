package com.zensar;

public class CurrentAccount extends Bank {
	
	@Override
	public long getAmount(long deposit) {
		// TODO Auto-generated method stub
		return amount += deposit;
	}

}
