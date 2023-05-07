package com.app.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<>();
		m1.put(6, "c");
		m1.put(null, "b");
		m1.put(null, "b");
		m1.put(2, "b");
		m1.put(3, "a");
		m1.put(4, "d");
		System.out.println(m1);
		System.out.println("-------------");
		Map<Integer, String> m2 = new LinkedHashMap<>();
		m2.put(2, "b");
		m2.put(null, "b");
		m2.put(null, "b");
		m2.put(6, "c");
		m2.put(3, "a");
		m2.put(4, "d");
		System.out.println(m2);
		System.out.println("-------------");
		Map<Integer, String> m3 = new TreeMap<>();
		m3.put(2, "b");
		m3.put(33, "b");
		m3.put(6, "c");
		m3.put(3, "a");
		m3.put(4, "d");
		
		System.out.println(m3);
		System.out.println("__________");
		Set<Entry<Integer, String>> set = m1.entrySet();
		for (Entry<Integer, String> e : set) {
			if(e.getKey()==null)
			System.out.println(e.getKey() + "  " + e.getValue());
		}
		System.out.println(m1.keySet());
		Iterator<Entry<Integer, String>> ii = set.iterator();

		
	}
}
