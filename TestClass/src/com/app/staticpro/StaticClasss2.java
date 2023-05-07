package com.app.staticpro;

public class StaticClasss2 {
	
	static {
		int a=20;
		StaticClasss2.a=StaticClasss2.a+a;
		a=a+StaticClasss2.a;
		StaticClasss2.a=a+a;
		System.out.println(" from static block:"+StaticClasss2.a);
		System.out.println(" locla a: "+a);
	}
	//static int a=10;
	static int a;
 public static void main(String[] args) {
	 System.out.println(" static a: "+StaticClasss2.a);
	
}
}
