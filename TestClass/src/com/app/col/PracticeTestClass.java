package com.app.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeTestClass {

	public static void main(String[] args) {

		List<Product> l = new ArrayList<>();
		l.add(new Product(1, "raj", 25.5));
		l.add(new Product(14, "yadav", 55.5));
		l.add(new Product(5, "boini", 45.5));
		l.add(new Product(10, "king", 35.5));
		
		System.out.println("List Collectoin");
		//Collections.sort(l, (p1, p2) -> p2.getEmpSal().compareTo(p1.getEmpSal()));
		Collections.sort(l);
		
		for (Product product : l) {
			System.out.println(product);
		}

		System.out.println();
		Set<Product> s = new HashSet<>();
		s.add(new Product(14, "yadav", 55.5));
		s.add(new Product(1, "raj", 205.5));
		s.add(new Product(5, "boini", 45.5));
		s.add(new Product(10, "king", 35.5));
		
		System.out.println("Set Collectoin");
		System.out.println();
		for (Product product : s) {
			System.out.println(product);
		}
	}

}
