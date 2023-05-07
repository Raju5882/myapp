package com.app.programme;

public class RevserseChar {

	public static void main(String[] args) {
		char[] ch = "test the link".toCharArray();
		for (int i = 0; i < ch.length; i++) {
		int k = i;
		while (i < ch.length && ch[i] != ' ')
		i++;
		char temp = ch[k];
		ch[k] = ch[i - 1];
		ch[i - 1] = temp;
		}

		System.out.println(ch);
	}

}
