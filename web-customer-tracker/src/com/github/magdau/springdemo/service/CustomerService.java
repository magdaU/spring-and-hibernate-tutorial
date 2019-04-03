package com.github.magdau.springdemo.service;

import java.util.List;

import com.github.magdau.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
}
