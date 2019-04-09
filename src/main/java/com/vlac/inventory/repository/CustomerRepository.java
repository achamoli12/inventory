package com.vlac.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vlac.inventory.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
