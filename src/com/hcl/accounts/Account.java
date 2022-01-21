package com.hcl.accounts;

public abstract class Account {

	private int account_number;
	private int balance;
	
	public Account(int account_number, int balance) {
		super();
		this.account_number = account_number;
		this.balance = balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
