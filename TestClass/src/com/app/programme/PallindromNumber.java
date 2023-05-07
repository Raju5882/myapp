package com.app.programme;

import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {

		
		int sum=0,r,num,m;
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the Number");
		num=s.nextInt();
		m=num;
		while (num>0) {
			
			r=num%10;
			sum=sum*10+r;
			num/=10;
			
		}
		if (m==sum) {
			 System.out.println(" Given Number is pallindrome :"+m);
		} else {
			System.out.println(" Given Number is not pallindrome :"+m);

		}
		
	}

}
