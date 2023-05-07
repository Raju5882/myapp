package com.app.col;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {

		String str = "Alice is girl and Bob is boy";
		/* {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}; */

		Map<String, Integer> count=new HashMap<>();

		String array[]=str.split(" ");
        
		for (String string : array) {
			System.out.println(string);
			if(count.containsKey(string))
			{
				count.put(string, count.get(string)+1);
			}
			else {
				count.put(string, 1);
			}
		}
		System.out.println(count);

	}

}
