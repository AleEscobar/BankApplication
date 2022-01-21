package com.hcl.customers;

import java.util.Date;
import java.util.List;
import com.hcl.transactions.Transaction;
import com.hcl.accounts.Account;

public class Customer {
	
	private String name;
	private String lastName;
	private String email;
	private String address;
	private String phone;
	private Date birthDate;
	private List<Account> accounts;
	private List<Transaction> transactions;
	
	public Customer(
			String name, String lastName, String email, String address, String phone, Date birthDate,
			List<Account> accounts, List<Transaction> transactions) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.birthDate = birthDate;
		this.accounts = accounts;
		this.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
