package com.app.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdpInterview {

	public static void main(String[] args) {

		String s = "hello world";

		char c[] = s.replace(" ", "").toCharArray(); 
		Map<Character, Integer> m = new HashMap<>();
		System.out.println(m);
		for (char d : c) 
		{ 
			if (m.containsKey(d)) 
		       {
				m.put(d,m.get(d) + 1);
				} 
			else { m.put(d, 1);
			     }
			
		}
		System.out.println(m);


				String s1 = "he llohii";
				String s2 = "iihelloh";
				char sc1[] = s1.replace(" ", "").toCharArray();
				char sc2[] = s2.replace(" ", "").toCharArray();
				if (sc1.length == sc2.length) {

					Arrays.sort(sc1);
					Arrays.sort(sc2);

					if (Arrays.equals(sc1, sc2)) {
						System.out.println("given strings are  anagram :" + s1 + "  " + s2);
					} else {
						System.out.println("given strings are not anagram");
					}
				} else {
					System.out.println("given strings are not anagram");
				}

				Integer a[] = { 8, 5, 6 };
				for (Integer integer : a) {
					System.out.println(integer);
				}
                System.out.println();
				int temp;

				for (int k = 0; k < a.length; k++) { // repeat loop
					for (int i = 0; i < a.length - 1; i++) { // comparision loop

						if (a[i] > a[i + 1]) {
							temp = a[i];
							a[i] = a[i + 1];
							a[i + 1] = temp;

						}
					}

				}
				for (Integer integer : a) {
					System.out.println(integer);
				}
				
				List <String> list1=new ArrayList<String>();
				list1.add("add");
				list1.add("notadd");
				list1.add("add");
				list1.add("notadd");
				list1.add("all");
				
				for (String string : list1) {
					System.out.println(string);
				}
				List <String> list12=new ArrayList<String>();
				for (String string : list1) {
				     if(!list12.contains(string))
				    	 list12.add(string);
					
				}
				System.out.println();
				for (String string : list12) {
					System.out.println(string);
				}
				
	}

}
