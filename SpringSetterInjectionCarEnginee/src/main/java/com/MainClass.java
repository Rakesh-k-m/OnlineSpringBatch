package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CarEngine.xml");

		Car c = (Car) context.getBean("myCar");
		c.e.display();
	}

}
