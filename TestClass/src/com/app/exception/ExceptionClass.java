package com.app.exception;

public class ExceptionClass {

	public static void main(String[] args) {

		System.out.println(test());
	}

	static int test() {

		try {
			int d = 100 / 0;
			return 10;
		} catch (Exception e) {
			System.out.println("hii");
			return 110;
		} finally {

			System.out.println("0k1");
			// System.exit(0);

			System.out.println(test2());
			System.out.println("ok2");
			//return 220;

		}

	}

	static String test2() {

		throw new ArithmeticException();
	}
}
