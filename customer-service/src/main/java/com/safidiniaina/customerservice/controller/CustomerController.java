package com.safidiniaina.customerservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safidiniaina.customerservice.model.Customer;
import com.safidiniaina.customerservice.repository.CustomerRepository;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    
    @GetMapping(value = "")
    public String hello(){
        return "Hello From "+ Thread.currentThread();
    }

    @GetMapping(value = "/all")
    public List<Customer> getCustomers(){
        return this.customerRepository.findAll();
    }

}
