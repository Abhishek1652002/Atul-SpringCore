package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Address;
import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		

		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.my.spring.model");
		
		Employee emp= ioc.getBean(Employee.class);
		Address add=ioc.getBean(Address.class);
		
		emp.setName("Abhishek");
		emp.setGender("male");
		emp.setId(1);
		
		add.setCity("hapur");
		add.setState("UP");
		
		
		System.out.println(emp);
		System.out.println(add);
		
		
	}


	
		
     
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}


