package com.app.programme;

import java.util.Arrays;
import java.util.Collections;

public class ArrayArranging {

	public static void main(String[] args) {

		int a[] = { 50, 19, 4, 2, 7 };
		int b[] = { 0, 1, 0,1, 0, 1 };
		int j, temp;
		Arrays.sort(b);
		for (int i = b.length-1; i >=0; i--) {
		System.out.print(b[i]);
	}
		System.out.println();
		System.out.println(" Before Arrange the element ");
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		for (int k = 0; k < a.length; k++) { // repeat loop
			for (int i = 0; i < a.length - 1; i++) { // comparision loop

				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

				}
			}

		}
		System.out.println(" After Arrange the element ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
