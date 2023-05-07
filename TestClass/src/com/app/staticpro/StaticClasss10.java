package com.app.staticpro;

public class StaticClasss10 {

	static int a = test();//1 st call//100

	public static void main(String[] args) {
		System.out.println(StaticClasss10.a);//120
	}

	static {
		System.out.println(StaticClasss10.a);//100
		StaticClasss10.a = StaticClasss10.a + 20;//120
	}

	private static int test() {
		StaticClasss10.a = 50;//a=50
		return StaticClasss10.test1();
	}

	private static int test1() {
		System.out.println(StaticClasss10.a);//a=50
		return 100;
	}

}
