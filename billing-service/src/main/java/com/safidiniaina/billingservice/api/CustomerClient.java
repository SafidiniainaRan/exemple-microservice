package com.safidiniaina.billingservice.api;

import java.util.Collections;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.safidiniaina.billingservice.model.Customer;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerClient {
    @GetMapping("/customer/all")
    @CircuitBreaker(name = "defaultCustomers", fallbackMethod = "getDefaultCustomers")
    List<Customer> getAllCustomers();

    default List<Customer> getDefaultCustomers(Exception ex){
        return Collections.emptyList();
    }
}
