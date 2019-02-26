package com.github.magdau.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {

		//Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check if they are the same
		boolean result =(theCoach == alphaCoach);
		
		//Print out the result
		System.out.println("\n Pointing to the same object: " + result);
		
		System.out.println("\n Memory location for theCoach:" + theCoach);
		
		System.out.println("\n Memory location for alphaCoach:" + alphaCoach + "\n");
		
		//Close the context
		context.close();

	}
}
