package com.safidiniaina.billingservice.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billing {
    private String name;
    private List<Customer> customers;
}
