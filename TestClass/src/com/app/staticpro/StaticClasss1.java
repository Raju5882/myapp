package com.app.staticpro;

public class StaticClasss1 {

	static {
		int a = 20;
		System.out.println(" Static a :" + StaticClasss1.a);//Defult values of int is 0
		StaticClasss1.a=StaticClasss1.a+a;	
		System.out.println(""+StaticClasss1.a);//here static a vlaue is 20
	}
	static int a = 10;//here static a vlaue is reasign from 20 to 10

	public static void main(String[] args) {
    System.out.println(" main a: "+StaticClasss1.a);
	}
}
