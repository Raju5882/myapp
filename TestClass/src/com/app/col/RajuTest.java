package com.app.col;

import java.util.Arrays;
import java.util.Collections;

public class RajuTest {

	public static void main(String[] args) {
		String s = "";
		String s1 = "raju";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		/* for (int i = s1.length() - 1; i <= 0; i--) */
		System.out.println();
		for (int i = s1.length() - 1; i >= 0; i--) {
			s += s1.charAt(i);
			System.out.println(s.hashCode()+" "+i);
			System.out.println(s+" "+i);
		}
		
		System.out.println();
		String test = "";
		System.out.println(s);
		int c = 0;
		char[] ch = s1.toCharArray();
		//Collections.reverse(Arrays.asList(ch));
		System.out.println(ch);
		for (char d : ch) {
			System.out.println(d);
		  }


	}
}