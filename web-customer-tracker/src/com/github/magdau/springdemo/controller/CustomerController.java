package com.github.magdau.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.magdau.springdemo.dao.CustomerDAO;
import com.github.magdau.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get customers from the dao
		List<Customer>theCustomer=customerDAO.getCustomers();
		
		//add the customers to the model
		theModel.addAttribute("customers", theCustomer);
		
		return "list-customers";
	}	
}


