package com.app.staticpro;

public class StaticClasss6 {
	static int a;

	public static void main(String[] args) {
		System.out.println(StaticClasss6.a);
		StaticClasss6.test(440);
		System.out.println(StaticClasss6.a);
	}

	private static void test(int i) {
		StaticClasss6.a = i;
	}

}
