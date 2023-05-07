package com.app.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testclass {

	public static void main(String[] args) {

		List<Product> l = new ArrayList<>();
		Product p = new Product(44, "v", 44.4);
		l.add(p);
		l.add(new Product(505, "e", 44.3));
		l.add(new Product(33, "a", 55.5));
		l.add(new Product(33, "a", 55.5));
		l.add(new Product(66, "c", 22.2));
		for (Product product : l) {
			System.out.println(product);
		}

		Map<Product, String> m = new HashMap<>();
		m.put(new Product(505, "e", 44.3), "dhj");
		m.put(new Product(33, "e", 44.3), "dhj");
		m.put(new Product(66, "c", 22.2), "dhj");
		m.put(new Product(33, "e", 44.3), "dhj");

		System.out.println("map    ================");
		Set<Entry<Product, String>> s = m.entrySet();

		for (Entry<Product, String> entry : s) {
			System.out.println(entry.toString());
		}
		
		System.out.println();
		System.out.println("from set");
		Set<Product> set = new HashSet<Product>();
		set.add(new Product(505, "e", 44.3));
		set.add(new Product(55, "e", 44.3));
		set.add(new Product(55, "e", 44.3));
		set.add(new Product(555, "e", 44.3));
		set.add(new Product(555, "e", 44.3));
		for (Product product : set) {
			System.out.println(product.toString());
		}

	}

}
