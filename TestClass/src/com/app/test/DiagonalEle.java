package com.app.test;

import java.util.Scanner;

public class DiagonalEle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int n = s.nextInt();
		int i = 1, count = 0;
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
		for (int i1 = 1; i1 <= 9; i1++) {
			System.out.println(i1);
			i1 += 3;
		}

		String x = "abc";
		String y = "raju";
		System.out.println(x.hashCode());
		x = "abc";
		System.out.println(x.concat(y));
		System.out.println(x.hashCode());
		System.out.println(x);
		System.out.println(y);
		String ss = null;
		DiagonalEle.test(ss);
		System.out.println(" ok done ");
         Test t=new Test();
         t.test();
         t=null;
		
	}

	public static void test(String s) {
		
		try {
			System.out.println(s.charAt(2));
			System.out.println(s.equals("raaju"));
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	protected void finalize() throws Throwable {
		System.out.println(" from finalize");
	}
}

class Test
{
	public void test()
	{
		System.out.println(" From test method");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(" from Finalize method");
	}
	
}