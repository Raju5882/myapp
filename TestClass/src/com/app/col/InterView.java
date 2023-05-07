package com.app.col;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterView {

	public static void main(String[] args) {
		int x;
		String s1 = "raju";
		System.out.println(s1.hashCode());
		String s2 = s1;
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		s1 = "ruru";
		System.out.println(s1.hashCode());
		System.out.println(s1 == s2);
		List<Integer> l = new LinkedList<>();
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(4);
		System.out.println(l);
		System.out.println(test(l));
	}

	public static List<Integer> test(List<Integer> l) {
		List<Integer> ss = new ArrayList<>();

		for (Integer integer : l) {

			if (!ss.contains(integer)) {
				ss.add(integer);
			}
		}
		return ss;
	}
}
