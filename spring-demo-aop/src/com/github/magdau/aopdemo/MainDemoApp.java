package com.github.magdau.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.magdau.aopdemo.dao.AccountDAO;
import com.github.magdau.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		theAccountDAO.addAccount();
		
		//get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// do it again!
		System.out.println("\nlet's call it again!\n");
		
		// call the business method again
		theAccountDAO.addAccount();
		
		//call the membership business method
		theMembershipDAO.addAcount();
				
		// close the context
		context.close();
	}

}