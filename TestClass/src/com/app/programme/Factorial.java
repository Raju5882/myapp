package com.app.programme;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the value");
		int n = s.nextInt();
		int fact=1;
		int i=1;
		
		/*using for loop loic
		 * for (int i = n; i >0; i--) { fact=fact*i; } System.out.println(fact);
		 */
		/* using while logic */
		while ( n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
