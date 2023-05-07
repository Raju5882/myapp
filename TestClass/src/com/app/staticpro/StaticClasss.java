package com.app.staticpro;

public class StaticClasss {

	static int a=10;
	
	public static void main(String[] args) {
		int a=20;
		StaticClasss.a=StaticClasss.a+a;
		a=a+StaticClasss.a;
		StaticClasss.a=StaticClasss.a+a+StaticClasss.a;
		System.out.println(" static a :"+StaticClasss.a);
		System.out.println(" local a:"+a);
	}
}
