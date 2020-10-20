package com.springhibernate.DAO;

import java.util.List;

import com.springhibernate.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomerById(int id);

	public void delete(int id);

}
