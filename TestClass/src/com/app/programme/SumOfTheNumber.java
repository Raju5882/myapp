package com.app.programme;

import java.util.Scanner;

public class SumOfTheNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the value");
		int n = s.nextInt();
		int sum=0,r;
		
		//m=n;
		while (n>0) {
			r=n%10;
			sum+=r;
			n=n/10;
		}
	
		System.out.println(" sum of the element :"+sum);
	}

}
