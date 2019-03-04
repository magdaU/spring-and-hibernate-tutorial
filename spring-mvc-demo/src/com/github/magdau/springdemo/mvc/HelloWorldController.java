package com.github.magdau.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // parent maping
public class HelloWorldController {
	
	// Need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm") // url  // sub maping
	public String showForm() {
		return "helloworld-form";  // the name of file.jsp
	}
	
	// Need a controller method to process to HTML form 
	
	@RequestMapping("/processForm")   // sub maping
	public String processForm() {
		return "helloworld";  // the name of file.jsp
	}
	
	// New a controller method to read form data and add data to the model
	
	@RequestMapping("/processFormVersionTwo") 
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//Read the request parameter from the HTML form 
		String theName = request.getParameter("studentName");
				
		//Convert the data to all caps
		theName=theName.toUpperCase();
			
		//Create message
		String result = "Yo!  " + theName;
		
		//Add a message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree") 
	public String processFormVersionThree(@RequestParam("studentName") String theName,
			Model model) {
					
		//Convert the data to all caps
		theName=theName.toUpperCase();
			
		//Create message
		String result = "Hey My Friend from v3!  " + theName;
		
		//Add a message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
