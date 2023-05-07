package com.app.test;

interface  Calculate {
	abstract int add(int a, int b);
}

public class AbstrctClass {
	public static void main(String[] args) {
		/*
		 * int result = new Calculate() {
		 * 
		 * @Override int add(int a, int b) { return a+b; } }.add(99, 99);
		 */
		
		int result=new Calculate() {
			
			public int add(int a, int b) {
				return a+b;
			}
		}.add(55, 88);
		System.out.println(result);
		
		Calculate t=(e,r)->r+e;
		System.out.println(t.add(33, 67));
		
	}

}
