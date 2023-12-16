package com.safidiniaina.billingservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.safidiniaina.billingservice.api.CustomerClient;
import com.safidiniaina.billingservice.model.Billing;
import com.safidiniaina.billingservice.model.Customer;

import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping(value = "/billing")

public class BillingController {

    CustomerClient customerClient;

    BillingController(CustomerClient customerClient){
        this.customerClient = customerClient;
    }

    @GetMapping("/all")
    public List<Billing> getBilling() {
        List<Billing> billings = Collections.emptyList();
        return billings; 
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return this.customerClient.getAllCustomers();
    }
    
}
