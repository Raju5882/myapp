package com.app.col;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.app.entity.Product;

public class TestClass {
	public static void main(String[] args) {
		List<Product> l = new LinkedList<>();
		l.add(new Product(4, "c", 4.4));
		l.add(new Product(3, "f", 5.6));
		l.add(new Product(2, "d", 9.6));
		l.add(new Product(2, "d", 9.6));
		l.add(new Product(1, "a", 5.5));
		l.add(new Product(5, "r", 4.6));
		
		Map<Product, Integer> m=new HashMap<Product, Integer>();
		m.put(new Product(4, "c", 4.4), 1);
		m.put(new Product(1, "c", 4.4), 1);
		m.put(new Product(1, "c", 4.4), 1);
		m.put(new Product(2, "c", 4.4), 1);
		m.put(new Product(2, "f", 4.4), 1);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Set<Product> d=m.keySet();
		
		List<Product> p=new LinkedList<>();
		p.addAll(d);
		Collections.sort(p);
		for (Product product : p) {
			System.out.println(product.toString());
		}
		System.out.println("-------Test-----");
		for (Product product : l) {
			System.out.println(product.toString());
		}
		Integer[] a = { 0, 1, 0, 1, 0, 1,0,0 };
		Collections.sort(Arrays.asList(a));
		Collections.reverse(Arrays.asList(a));
		
		for (Integer integer : a) {
			System.out.println(integer);
		}
		
		

	}

}
