package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {

	public static void main(String[] args) {
		ApplicationContext a = new AnnotationConfigApplicationContext(Configzclass.class);
		Employee e = a.getBean("emp1", Employee.class);
		Product p =a.getBean("Prod",Product.class);
		System.out.println(p);
		System.out.println(e);
	}

}
