package com.hcl.idao;

import java.util.List;

import com.hcl.customers.Customer;

public interface ICustomerDao {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void addCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public void updateCustomer(Customer customer);
}
