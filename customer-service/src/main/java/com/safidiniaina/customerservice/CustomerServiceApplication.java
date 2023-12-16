package com.safidiniaina.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.safidiniaina.customerservice.model.ConfigParams;
import com.safidiniaina.customerservice.model.Customer;
import com.safidiniaina.customerservice.repository.CustomerRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(ConfigParams.class)
public class CustomerServiceApplication implements CommandLineRunner {

	private CustomerRepository customerRepository; 

	public CustomerServiceApplication(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.customerRepository.save( new Customer(null, "Safidiniaina"));
		this.customerRepository.save( new Customer(null, "Randrinanarindra"));		
	}

}
