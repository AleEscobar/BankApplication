package com.hcl.idao;

import java.util.List;

import com.hcl.transactions.Transaction;

public interface ITransactionDao {
	public List<Transaction> getTransactions();
	public Transaction getTransaction(int id);
	public void addTransaction(Transaction transaction);
	public void deleteTransaction(Transaction transaction);
	public void updateTransaction(Transaction transaction);
}
