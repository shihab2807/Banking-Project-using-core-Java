package com.banking.utilization;

import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.service.BankUser;

public class Main {

	public static void main(String[] args) {
		Account a1=new Account("abc",1234567l, 0);
		BankingService b1=new BankingService();
		BankUser b=b1.login(1111);
		Transaction t1=new Transaction();
		b.transaction(7000.0, t1, 1, a1);
		
	

	}

}
