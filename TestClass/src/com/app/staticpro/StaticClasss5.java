package com.app.staticpro;

public class StaticClasss5 {
	static int a;

	public static void main(String[] args) {
		System.out.println(StaticClasss5.a);
		StaticClasss5.a = StaticClasss5.test();
		System.out.println(StaticClasss5.a);
	}

	private static int test() {
		return 200;
	}

}
