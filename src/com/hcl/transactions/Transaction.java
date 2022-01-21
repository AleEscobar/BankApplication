package com.hcl.transactions;

import java.util.Date;

enum OperationType { ADD, SUBSTRACTION; }

public class Transaction {
	
	private float transactionAmount;
	private Date transactionDate;
	private OperationType operationType;
	private int id_account;
	private int id_card;
	
	public Transaction(float transactionAmount, Date transactionDate, OperationType operationType, int id_account, int id_card) {
		super();
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.operationType = operationType;
		this.id_account = id_account;
		this.id_card = id_card;
	}
	
	public float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public OperationType getOperationType() {
		return operationType;
	}
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	public int getId_account() {
		return id_account;
	}
	public void setId_account(int id_account) {
		this.id_account = id_account;
	}
	public int getId_card() {
		return id_card;
	}
	public void setId_card(int id_card) {
		this.id_card = id_card;
	}
	
}
