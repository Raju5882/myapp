package com.app.programme;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the Number");
		int a=s.nextInt();
		int b=s.nextInt();
		int temp;
		System.out.println(" using third variable");
		System.out.println("Numeber before swap  a:"+a+" and b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numeber after swap  a:"+a+" and b:"+b);
		System.out.println(" using without third variable ");
		System.out.println("Numeber before swap  a:"+a+" and b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numeber after swap  a:"+a+" and b:"+b);
		
	}

}
