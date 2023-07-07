package com.banking.service;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class PhonePay implements BankUser{
	@Override
	public void transaction(double amt,Transaction t1,int choice,Account a) {
		if (choice == 1)
		{
			System.out.println("send by using phonepay");
			send(amt,t1,a);
			
		}
		 if (choice == 2)
		{
			System.out.println("recieve by using phonepay");
			recieve(amt,t1,a);
		}
		 if (choice == 3)
		{
			System.out.println("bal by phonepay");
			t1.checkbal(a);
		}
		else {
			System.out.println("invalid choice");
		}
	}
public void send (double amt,Transaction t,Account a) {
	t.withdraw(amt,a);
}
public void recieve (double amt,Transaction t,Account a) {
	t.deposit(amt,a);
}

}
