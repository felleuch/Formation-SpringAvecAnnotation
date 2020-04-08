package com.wha.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	
	@Before("methodSayHello()  ||    methodGetAllCustomers()")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	
	@Pointcut("execution(* com.wha.services.HelloWorldService.sayHello(..))")
	private void methodSayHello() {}
	
	@Pointcut("execution(* com.wha.services.CustomerService.getAllCustomers(..))")
	private void methodGetAllCustomers() {}
	
	
	
	/*
	@Around("execution(* com.wha.services.HelloWorldService.sayHello(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("SPRING-AOP method : " + joinPoint.getSignature().getName());
		System.out.println("SPRING-AOP arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
		
		System.out.println("******");

	}
	*/
	
	
}
