package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRespositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	/**
	 * We removed the hardcoded reference to HibernateCustomerRepositoryImpl 
	 * and went on to provide a setter and Inject it through the name in the applicationContext.xml
	 */
	private CustomerRepository customerRepository;

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	
	/**
	 * We are going to define a constructor with one argument which is of CustomerRepository reference.
	 */
	public CustomerServiceImpl()
	{
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository=customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
