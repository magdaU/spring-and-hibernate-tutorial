package com.github.magdau.springdemo.dao;

import java.util.List;

import com.github.magdau.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
