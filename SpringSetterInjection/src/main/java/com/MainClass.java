package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonInfo.xml");
		Person p = (Person) context.getBean("myPerson");
		
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Email: "+p.getEmail());
	}
	
}
