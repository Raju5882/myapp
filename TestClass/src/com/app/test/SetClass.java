package com.app.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {

		
		Set<Integer> s1=new HashSet<>();
		s1.add(3);
		s1.add(33);
		s1.add(13);
		s1.add(23);
		Set<Integer> s2=new LinkedHashSet<>();
		s2.add(3);
		s2.add(33);
		s2.add(13);
		s2.add(13);
		s2.add(23);
		Set<Integer> s3=new TreeSet<>();
		s3.add(3);
		s3.add(33);
		s3.add(13);
		s3.add(23);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.isEmpty());
		System.out.println(s1.remove(3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	    System.out.println(s1.size());
		for (Integer i : s2) {
			System.out.println(i);
		}
	}

}
