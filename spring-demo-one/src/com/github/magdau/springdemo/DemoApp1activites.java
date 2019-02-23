package com.github.magdau.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp1activites {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1activies.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("myRunnerCoach", Coach.class);

		//call method on the bean
		System.out.println(theCoach.getDailyWarkout());
		
		//close the context
		context.close();
	}
}
