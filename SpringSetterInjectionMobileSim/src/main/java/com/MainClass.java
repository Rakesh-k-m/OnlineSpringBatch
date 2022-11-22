package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("MobileSim.xml");
		
		Mobile m = (Mobile) context.getBean("myMobile");
		
		System.out.println("Mobile Name: "+m.getName());
		System.out.println("Mobile Ram: "+m.getRam());
		System.out.println("------------------------");
		System.out.println("Sim Number: "+m.getSim().getNumber());
		System.out.println("Sim Service: "+m.getSim().getService());
		
		
	}

}
