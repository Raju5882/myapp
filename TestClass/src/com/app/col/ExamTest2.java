package com.app.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExamTest2 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(7);
		l.add(3);
		l.add(5);
		l.add(3);
		l.add(3);
		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(" Set elements "+s.getClass());
		for (Integer integer : s) {
			System.out.println(integer);
		}
		l.clear();
		l.addAll(s);
		Collections.sort(l);
		System.out.println("---------------");
		for (Integer integer : l) {
			System.out.println(integer);
		}

	}

	
	public    void  testExam(int d,int b)
	{
		System.out.println(b+d);
	}
}
