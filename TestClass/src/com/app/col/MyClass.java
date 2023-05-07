package com.app.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {

		
		List<Product> l=new ArrayList<>();
		l.add(new Product(13, "yadav", 34.4));
		l.add(new Product(10, "yaju", 44.4));
		l.add(new Product(12, "boini", 24.4));
		
		Collections.sort(l, (p1,p2)->p1.getEmpName().compareTo(p2.getEmpName()));
		for (Product product : l) {
			
			System.out.println(product);
		}
		System.out.println("ok");
	}

}
