package com.hcl.accounts;

public class SavingAccount extends Account {

	private float monthlyInterest;
	
	public SavingAccount(int account_number, int balance, float monthlyInterest) {
		super(account_number, balance);
		this.monthlyInterest = monthlyInterest;
	}

	public float getMonthlyInterest() {
		return monthlyInterest;
	}

	public void setMonthlyInterest(float monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	
}
