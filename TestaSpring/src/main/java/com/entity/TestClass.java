package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {

		ApplicationContext a = new ClassPathXmlApplicationContext("config.xml");
		Employee e1 = a.getBean("emp1", Employee.class);
		System.out.println(e1);
		System.out.println(a.getBean("t", Test.class));
		System.out.println(a.getBean(Parentclass.class));
		Model m = new AnnotationConfigApplicationContext(Configzclass.class).getBean("model1", Model.class);
		System.out.println(m);

	}

}
