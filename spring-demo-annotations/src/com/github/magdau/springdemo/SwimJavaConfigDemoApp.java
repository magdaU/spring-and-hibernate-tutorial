package com.github.magdau.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read spring config java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		//name of bean is the same like class with start lower letter first
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
			
		//Call method to get a daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
			
		//Call our new swim coach method...has the props value injected
		System.out.println("email: "+ theCoach.getEmail());
		System.out.println("team:  "+ theCoach.getTeam());
		
		//Close the context
		context.close();
	}
}
