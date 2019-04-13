package com.github.magdau.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	@Before("execution(* com.github.magdau.aopdemo.dao.*.*(..))") // 1* return type, 2 package, 3* class, 4 * methods, 5 params (..)
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + "doWork");
		return false;
	}
}











