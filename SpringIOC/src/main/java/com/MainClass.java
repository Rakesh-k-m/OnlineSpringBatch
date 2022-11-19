package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("dinga.xml");
		
		Customer c = (Customer) context.getBean("Naveen");
		
	}

}
