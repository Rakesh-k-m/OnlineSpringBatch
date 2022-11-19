package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Oneplus.xml");
		
		Mobile m = (Mobile) context.getBean("nord");
		m.ios();
	}
}
