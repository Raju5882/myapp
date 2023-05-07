package com.app;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hello");
		int count=0;
		String s1="twesdftgyhu tryukn ghujik";
		char[] array=s1.replace(" ", "").toCharArray();
		
		Map<Character,Integer> m=new HashMap<Character, Integer>();

		for (char c : array) {
			if(m.containsKey(c))
			{
				System.out.println(c);
				m.put(c,m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		
	}

}
