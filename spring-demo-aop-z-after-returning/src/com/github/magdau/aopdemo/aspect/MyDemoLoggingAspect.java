package com.github.magdau.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.github.magdau.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.github.magdau.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJointPoint) {		
		System.out.println("\n=====>>> Executing @Before advice on method");	
		
		//display the method signature
		MethodSignature methoSig = (MethodSignature) theJointPoint.getSignature();
		System.out.println("Method:" + methoSig);
		
		//display method arguments
		
		
		//get args
		Object [] args= theJointPoint.getArgs();
		
		//loop thru args
		for( Object tempArgs : args) {
			System.out.println(tempArgs);
			
			if(tempArgs instanceof Account) {
				
				//downcast and print Account specific stuff
				Account theAccount = (Account)tempArgs;
				
				System.out.println("account name" + theAccount.getName());
				System.out.println("account name" + theAccount.getLevel());
			}
		}
			
	}
	
}