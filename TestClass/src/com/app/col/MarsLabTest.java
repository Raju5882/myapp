package com.app.col;

import java.util.Scanner;

public class MarsLabTest {

	public static void main(String[] args) {

		String s="hello world welcome"; 
		String stringReverse ="";
		
		String[] r=s.split(" ");
		
		for (int i = 0; i < r.length; i++) {
			
			String word=r[i];
			
			String revword="";
			
			for (int j = word.length()-1; j >=0; j--) {
				revword=revword+word.charAt(j);
			}
			stringReverse=stringReverse+revword+" ";
		}
		
	System.out.println(stringReverse);
		
	}


}
