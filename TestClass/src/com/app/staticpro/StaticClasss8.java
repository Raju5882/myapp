package com.app.staticpro;

public class StaticClasss8 {

	static int a = test();

	public static void main(String[] args) {
		System.out.println(StaticClasss8.a);

	}

	private static int test() {
		StaticClasss8.a = 50;
		return test1();
	}

	private static int test1() {
		System.out.println(StaticClasss8.a);
		return 100;
	}

}
