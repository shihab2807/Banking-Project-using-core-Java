package com.banking.service;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class Gpay implements BankUser{
	@Override
	public void transaction(double amt,Transaction t1,int choice,Account a) {
		if (choice == 1)
		{
			send(amt,t1,a);
		}
		if (choice == 2)
		{
			recieve(amt,t1,a);
		}
		if (choice == 3)
		{
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


