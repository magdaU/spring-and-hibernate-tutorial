package com.github.magdau.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWarkout());
	
		//close the context
		context.close();

	}
}
