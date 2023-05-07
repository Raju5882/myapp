package com.app.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListClass {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(55);
		l1.add(1);
		l1.add(33);
		Collections.sort(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		List<Integer> l2 = new LinkedList<>();
		l2.add(2);
		l2.add(1);
		l2.add(55);
		l2.add(33);
		System.out.println(l2);
		System.out.println("------------");
		for (Integer i : l1) {
			System.out.println(i);
		}
		System.out.println("------------");
		Iterator<Integer> it = l1.iterator();

		ListIterator<Integer> list = l2.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println();
		System.out.println(list.previous());

	}
}
