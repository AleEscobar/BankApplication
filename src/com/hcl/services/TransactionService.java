package com.hcl.services;

import java.util.List;

import com.hcl.idao.ITransactionDao;
import com.hcl.transactions.Transaction;

public class TransactionService implements ITransactionDao {

	public TransactionService() {
		super();
	}

	@Override
	public List<Transaction> getTransactions() {
		return null;
	}

	@Override
	public Transaction getTransaction(int id) {
		return null;
	}

	@Override
	public void addTransaction(Transaction transaction) {

	}

	@Override
	public void deleteTransaction(Transaction transaction) {

	}

	@Override
	public void updateTransaction(Transaction transaction) {

	}

}
