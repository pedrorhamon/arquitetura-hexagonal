package org.acme.service;

import java.util.List;

import org.acme.model.Customer;
import org.acme.repositories.CustomerRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

/**
 * @author pedroRhamon
 */
@ApplicationScoped
public class CustomerService {
	
	@Inject
	CustomerRepository customerRepository;
	
	public List<Customer> findAllCustomers() {
		return this.customerRepository.findAll().list();
	}
	
	@Transactional
	public void addCustomer(Customer customer) {
		this.customerRepository.persist(customer);
	}

}
