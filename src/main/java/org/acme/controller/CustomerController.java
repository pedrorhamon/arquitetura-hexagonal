package org.acme.controller;

import java.util.ArrayList;
import java.util.List;

import org.acme.ListaException;
import org.acme.model.Customer;
import org.acme.service.CustomerService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * @author pedroRhamon
 */
@Path(value = "/api/customer")
public class CustomerController {

	@Inject
	CustomerService customerService;

	@GET
	public List<Customer> retrieveCustomers() {
		List<Customer> customers = new ArrayList<>();
		try {
			this.customerService.findAllCustomers();
		} catch (ListaException e) {
			e.getMessage();
		}
		return customers;
	}

	@POST
	public void addCustomer(Customer customer) {
		this.customerService.addCustomer(customer);
	}

}
