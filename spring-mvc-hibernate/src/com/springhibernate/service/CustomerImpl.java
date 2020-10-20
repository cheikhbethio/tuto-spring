package com.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.DAO.CustomerDao;
import com.springhibernate.entity.Customer;

@Service
public class CustomerImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDao.saveCustomer(theCustomer);		
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	@Transactional
	public void delete(int id) {
		customerDao.delete(id);		
	}

}
