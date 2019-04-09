package com.vlac.inventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vlac.inventory.model.Customer;
import com.vlac.inventory.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	
	/*
	 * CustomerController(CustomerRepository repository){ this.repository =
	 * repository; }
	 */
	 
	
	@PostMapping("/customer")
	Customer saveCustomer(@RequestBody Customer customer) {
		return repository.save(customer);
	}
	
	@GetMapping("/customers")
	List<Customer> getCustomers() {
		return (List<Customer>) repository.findAll();
	}

}
