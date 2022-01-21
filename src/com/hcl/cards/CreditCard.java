package com.hcl.cards;

import java.util.Date;

public class CreditCard extends Card {
	
	private Date cutoffDate;
	
	public CreditCard(
			int number, Date expiryDate, int nip, 
			OperatorNetwork operatorNetwork, Date cutoffDate) {
		super(number, expiryDate, nip, operatorNetwork);
		this.cutoffDate = cutoffDate;
	}

	public Date getCutoffDate() {
		return cutoffDate;
	}

	public void setCutoffDate(Date cutoffDate) {
		this.cutoffDate = cutoffDate;
	}

}
