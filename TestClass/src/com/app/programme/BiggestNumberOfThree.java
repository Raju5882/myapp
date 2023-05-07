package com.app.programme;

import java.util.Scanner;

public class BiggestNumberOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the abc value");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(a > b && a > c ? a + " is Biggest number "
				: b > c ? b + " b is Biggest number " : c + "is Biggest number ");
		if (a > b && a > c) {
			System.out.println(a + " is Biggest number ");
		} else {

			if (c > b) {
				System.out.println(c + "is Biggest number ");
			} else {
				System.out.println(b + " b is Biggest number ");

			}
		}
	}

}
