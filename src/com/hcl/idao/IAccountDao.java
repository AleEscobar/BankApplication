package com.hcl.idao;

import java.util.List;

import com.hcl.accounts.Account;

public interface IAccountDao {

	public List<Account> getAccounts();
	public Account getAccount(int id);
	public void addAccount(Account account);
	public void deleteAccount(Account account);
	public void updateAccount(Account account);
}
