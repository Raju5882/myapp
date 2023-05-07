package com.app.staticpro;

public class StaticClasss4 {

	static int a;

	public static void main(String[] args) {
		System.out.println(StaticClasss4.a);
		StaticClasss4.testCase();
		System.out.println(StaticClasss4.a);
	}

	public static void testCase() {
		a = 100;
	}
}
