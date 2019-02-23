package com.github.magdau.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp4activies {

	public static void main(String[] args) {
		
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		//name of bean is the same like class with start lower letter first
		Coach theCoach = context.getBean("fitnessCoach", Coach.class);
			
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();
	}
}
