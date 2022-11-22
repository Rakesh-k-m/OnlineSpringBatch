package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeInfo.xml");
		Employee e = (Employee) context.getBean("myEmployee");

		System.out.println("Id: " + e.getId());
		System.out.println("Name: " + e.getName());
		System.out.println("Email: " + e.getEmail());
		System.out.println("PhoneNumber: " + e.getPhoneNumber());
		System.out.println("Salary: " + e.getSalary());

	}

}
