package com.hcl.cards;

import java.util.Date;

enum OperatorNetwork { VISA, MASTERCARD; }

public abstract class Card {
	
	private int number;
	private Date expiryDate;
	private int nip;
	private OperatorNetwork operatorNetwork;
	
	public Card(int number, Date expiryDate, int nip, OperatorNetwork operatorNetwork) {
		super();
		this.number = number;
		this.expiryDate = expiryDate;
		this.nip = nip;
		this.operatorNetwork = operatorNetwork;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public OperatorNetwork getOperatorNetwork() {
		return operatorNetwork;
	}

	public void setOperatorNetwork(OperatorNetwork operatorNetwork) {
		this.operatorNetwork = operatorNetwork;
	}
	
	
	
}
