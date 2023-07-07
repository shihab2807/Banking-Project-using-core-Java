package com.banking.service;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class Atm implements BankUser {
@Override
public void transaction(double amt,Transaction a1,int choice,Account a)
{
	if (choice == 1)
	{
		System.out.println("deposit by using ATM");
		a1.deposit(amt ,a);
	}
	else if (choice == 2)
	{
		System.out.println("withdraw by using ATM");
		a1.withdraw(amt ,a);
	}
	else if (choice == 3)
	{
		System.out.println("check bal by using ATM");
		a1.checkbal(a);
	}
	else {
		System.out.println("invalid choice");
	}
}
}
