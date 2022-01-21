package com.hcl.accounts;

import java.util.Date;

public class MortgaugeAccount extends Account {

	private float tax;
	private float debt;
	private float monthlyPayment;
	private Date expiryDate;
	
	

	public MortgaugeAccount(
			int account_number, int balance, float tax,
			float debt, float monthlyPayment, Date expiryDate) {
		super(account_number, balance);
		this.tax = tax;
		this.debt = debt;
		this.monthlyPayment = monthlyPayment;
		this.expiryDate = expiryDate;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getDebt() {
		return debt;
	}

	public void setDebt(float debt) {
		this.debt = debt;
	}

	public float getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(float monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
}
