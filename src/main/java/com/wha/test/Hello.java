package com.wha.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wha.services.Customer;
import com.wha.services.HelloWorldService;

public class Hello {
	
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		
		String message = service.sayHello();
		System.out.println(message);
		
		
		
		Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust.toString());
		
	}
	

}



