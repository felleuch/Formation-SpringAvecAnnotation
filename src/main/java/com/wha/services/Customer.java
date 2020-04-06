package com.wha.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Customer 
{
	
	
	private Person person;
	
	private int type;
	
	private String action;
	
	
	
	public Person getPerson() {
		return person;
	}

	
	@PostConstruct
	public void initIt() throws Exception{
		System.out.println("Spring init method ..");
	}
	
	
	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring destroy method ..");
	}

	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public String getAction() {
		return action;
	}



	public void setAction(String action) {
		this.action = action;
	}

	
	public String toString(){
		return "Customer :action="+action+"type=" +type+"   Person name="+person.getName();
	}


	
//	public Customer(Person person) {
//		this.person = person;
//	}
}
