package com.app.programme;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the Number");
		int n = s.nextInt();
		int count = 0, i = 1;
		while (i <= n) {
			if (n % i == 0) {
				count++;
			}
			
			i++;
		}
		if (count == 2) {
			System.out.println(n + " is prime Number ");
		} else {

			System.out.println(n + " is not prime Number ");
		}
	}

}
