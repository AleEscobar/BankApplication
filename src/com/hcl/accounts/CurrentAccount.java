package com.hcl.accounts;

public class CurrentAccount extends Account {

	private int IBAN;

	public CurrentAccount(int account_number, int balance, int IBAN) {
		super(account_number, balance);
		this.IBAN = IBAN;
	}

	public int getIBAN() {
		return IBAN;
	}

	public void setIBAN(int iBAN) {
		IBAN = iBAN;
	}
}
