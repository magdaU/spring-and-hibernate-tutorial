package com.github.magdau.springdemo.mvc;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//Resolve issue for validation - whitespace (input), Defined in Spring API
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		//Removes whitespace -leading and trailing, true - means trim to null
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		//To each String class use stringTrimmer Class
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		System.out.println("Last name: |" + theCustomer.getLastName() + "|");
		
		System.out.println("Binding result: " + theBindingResult);
		
		System.out.println("\n\n\n\n");
		
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
	}
}













