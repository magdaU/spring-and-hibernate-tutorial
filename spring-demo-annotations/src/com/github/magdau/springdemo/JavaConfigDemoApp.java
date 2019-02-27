package com.github.magdau.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		//name of bean is the same like class with start lower letter first
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
			
		//Call method to get a daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();
	}
}
