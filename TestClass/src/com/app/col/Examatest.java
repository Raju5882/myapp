package com.app.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Examatest {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(33);
		array.add(21);
		Character a[] = { 'r', 'n', 'a' };
		System.out.println("Before arrange ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Character a2[] = { 'r', 'n', 'a' };
		Arrays.sort(a);
		System.out.println("after arrange");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.equals(a, a2));
		System.out.println(" Array List");
		for (Integer integer : array) {
			System.out.println(integer);
		}
		System.out.println(array.contains(33));
		List<Integer> link = new LinkedList<>();
		link.add(2);
		link.add(33);
		link.add(21);
		System.out.println(link.contains(33));
		System.out.println(" Linked List");
		for (Integer integer : link) {
			System.out.println(integer);
		}

	}
}
