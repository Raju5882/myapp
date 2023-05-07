 package gr.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gr.com.ConfigurationClass;
import gr.com.util.MailSenderUtil;

public class TestClass {
	public static void main(String[] args) {

                    ApplicationContext ap=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		/*
		 * boolean status=ap.getBean("mailSenderUtil",MailSenderUtil.class).send(); if
		 * (status) { System.out.println("mail send Successfully"); } else {
		 * System.out.println("mail sending fail");
		 * 
		 * }
		 */
	}
}
