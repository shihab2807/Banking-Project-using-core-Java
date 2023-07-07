package com.banking.utilization;

import com.banking.service.Atm;
import com.banking.service.BankUser;
import com.banking.service.Gpay;
import com.banking.service.PhonePay;

public class BankingService {
	BankUser b1;
	public BankUser login(int pin) {
	if (pin == 1111){ 
		System.out.println("Atm object is created ");
		b1 = new Atm();
		return b1;
		
	}
if(pin ==2222)
{
	System.out.println("phonepay object is created");
	b1 =new PhonePay();
	return b1;
}
if(pin == 3333) {
	System.out.println("gpay object is createdd cf");
	b1=new Gpay();
	return b1;
	
	}
else {
	System.out.println("invalid input");
	return b1;
}
}
}
