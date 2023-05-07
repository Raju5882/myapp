package com.app.programme;

import java.util.Scanner;

public class PallindromeString {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the String");
		String dummy = s.next().toLowerCase();
		String original = dummy.replaceAll(" ", "");
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {

			reverse += original.charAt(i);

		}

		if (reverse.equals(original)) {
			System.out.println("Given String is Pallindrop String");
		} else {

			System.out.println("Given String is not Pallindrop String");
		}

		String dummy2 = s.next().toLowerCase();
		StringBuffer sb = new StringBuffer("mAdam");
		// sb.append(dummy2);
		sb.reverse();
		String ss = new String(sb);
		if (dummy2.equalsIgnoreCase(ss)) {
			System.out.println(" given String is Pallindorme String");
		} else {
			System.out.println(" given String is not Pallindorme String ");
		}

	}
}
