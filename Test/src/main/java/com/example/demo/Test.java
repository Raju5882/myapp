package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Test implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
    int a=20;
    System.out.println(a*a);
    System.out.println("new comment");
    System.out.println("new comment");
    System.out.println();
    Employee e=new Employee();
	}

	
	
	
}
