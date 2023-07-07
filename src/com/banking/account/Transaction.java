package com.banking.account;

public class Transaction {
	
	public void deposit(double amt,Account a1)
	{
		if(amt >=0) {
			double b1= a1.getBal()+amt;
			a1.setBal(b1);
		}
	}
	public void withdraw(double amt,Account a1)
	{
		if(amt >=0 && a1.getBal()>=amt)
		{
			double b1=a1.getBal()-amt;
			a1.setBal(b1);
			
		}
		
	}
	public void checkbal(Account a1) {
		System.out.println("current bal : "+a1.getBal());
		
	}
}
