package com.github.magdau.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp3activies {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext3activies.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("myTenisCoach", Coach.class);
		
		Coach alphaCoach=context.getBean("myTenisCoach", Coach.class);
		
		//check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		System.out.println("\nPointing to the same object:  " + result);
		
		System.out.println("\nMemory location for theCoach:   " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach:    " + alphaCoach + "\n");
		
		//close the context
		context.close();
	}
}
