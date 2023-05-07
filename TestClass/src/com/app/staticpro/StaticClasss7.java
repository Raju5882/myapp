package com.app.staticpro;

public class StaticClasss7 {

	private static int a = test();

	public static void main(String[] args) {

		System.out.println(StaticClasss7.a);
		System.out.println(" from main");
	}

	private static int test() {
		System.out.println("from test");
		return 1000;
	}

}
