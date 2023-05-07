package com.app.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Employee;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = ap.getBean("emp", Employee.class);
		System.out.println(emp);
	}

}
