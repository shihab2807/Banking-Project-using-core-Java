package com.banking.account;

public class Account {
	String name ;
	long accno ;
	double bal;
	public Account(String name, long accno,double bal) {
		this.name=name;
		this.accno=accno;
		this.bal=bal;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	
	 
	
	
		
	
	

}
