package com.app.staticpro;

public class StaticClasss3 {

	static {
		int a = 20;
		StaticClasss3.a = a + a;
	}

	static int a;

	public static void main(String[] args) {
		System.out.println(StaticClasss3.a);
	}

}
