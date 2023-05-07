package com.app.test;

public interface MyData {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println(" Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}