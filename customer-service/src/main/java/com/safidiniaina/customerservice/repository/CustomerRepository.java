package com.safidiniaina.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safidiniaina.customerservice.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
