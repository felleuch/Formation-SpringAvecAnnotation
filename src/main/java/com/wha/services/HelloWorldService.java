package com.wha.services;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Component
public class HelloWorldService {
	
	private String name="toto";
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name=name;
	}
	
	
	public String sayHello() {
		return "Name =  "+ name;
	}
	
}


