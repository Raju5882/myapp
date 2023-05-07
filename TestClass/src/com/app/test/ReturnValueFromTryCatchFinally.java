package com.app.test;

public class ReturnValueFromTryCatchFinally {
	public static void main(String[] args) {
		System.out.println(methodReturningValue());
	}

	static int methodReturningValue() {
		int i = 0;

		try {
			i = 551;
			int f = i / 0;
			return 44;

		} catch (Exception e) {
			i = 2;

			return 66;
		}

	}
}