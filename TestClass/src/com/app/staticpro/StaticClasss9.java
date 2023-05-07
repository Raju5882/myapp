package com.app.staticpro;

public class StaticClasss9 {
	static int a = 50;

	public static void main(String[] args) {
		System.out.println(StaticClasss9.a+StaticClasss9.test());
	}

	private static int test() {
		System.out.println(StaticClasss9.a);
		StaticClasss9.a = StaticClasss9.a + 100;
		return StaticClasss9.a;
	}

}
