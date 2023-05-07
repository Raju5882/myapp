package com.app.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Employee;

public class TestClass {

	public static void main(String[] args) {
		
		  //ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		  ApplicationContext ap =new
		  AnnotationConfigApplicationContext(AppConfig.class); Employee emp =
		  ap.getBean( "emp",Employee.class); System.out.println(emp);
	

	}

}
