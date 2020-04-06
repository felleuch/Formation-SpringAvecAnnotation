package com.wha.services;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	
	String name="personne01";
	
	String age;
	
	String adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	

}
