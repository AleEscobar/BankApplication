package com.hcl.services;

import java.util.List;

import com.hcl.customers.Customer;
import com.hcl.idao.ICustomerDao;

public class CustomerService implements ICustomerDao {

	public CustomerService() {
		super();
	}

	@Override
	public List<Customer> getCustomers() {
		return null;
	}

	@Override
	public Customer getCustomer(int id) {
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {

	}

	@Override
	public void deleteCustomer(Customer customer) {

	}

	@Override
	public void updateCustomer(Customer customer) {

	}

}
