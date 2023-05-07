package com.app.staticpro;

public class StaticClasss11 {

	
	static
	{
		StaticClasss11.a=StaticClasss11.test();
	}
	
	static int a=70;
	public static void main(String[] args) {
     System.out.println(StaticClasss11.a);
	}
	static
	{
		StaticClasss11.a=StaticClasss11.a+StaticClasss11.test();
	}
	
	private static int test() {
		StaticClasss11.a=50;
		return StaticClasss11.test1();
	}
	private static int test1() {

		System.out.println(StaticClasss11.a);
		return StaticClasss11.a+30;
	}

}
