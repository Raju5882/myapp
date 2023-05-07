 package com.app.programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {

		/* reverse the array using another array */
		Integer a[] = { 4, 6, 3 };
		int j = 0;
		int[] b = new int[a.length];
		/*
		 * for (int i = 0; i < a.length; i++) 
		 * { b[j - 1] = a[i]; j --; }
		 */
		for (int i = a.length-1; i >=0; i--) {
			b[j] = a[i];
			j ++;
		}
		System.out.println(" reverse List of Array");
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}

		/* reverse the array using same array */
		int   t;
		for (int i = 0; i < b.length / 2; i++) {
			t = b[i];
			b[i] = b[b.length - i- 1];
			b[b.length - i - 1] = t;
		}
		System.out.println(" reverse List of Array");
		for (int l1 = 0; l1 < b.length; l1++) {
			System.out.println(b[l1]);
		}
		/* using utilClass Collections Class */
		List<Integer> tt=Arrays.asList(a);
		Collections.reverse(tt);

		for (Integer integer : tt) {
		//	System.out.println(integer);
		}
	
	}

}
