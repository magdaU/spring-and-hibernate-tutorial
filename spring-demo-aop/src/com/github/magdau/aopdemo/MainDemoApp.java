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
		
		//get membership bean from spring conatiner
		MembershipDAO theMemberShipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		//call the membership business method
		theMemberShipDAO.addSillyMember();
				
		// close the context
		context.close();
	}

}








