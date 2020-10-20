package com.springhibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhibernate.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session currentSession  = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		return theQuery.getResultList();
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session currentSession  = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		Session curSession= sessionFactory.getCurrentSession();
		return curSession.get(Customer.class, id);
	}

	@Override
	public void delete(int id) {
		Session curSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = curSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", id);
		theQuery.executeUpdate();
	}

}
