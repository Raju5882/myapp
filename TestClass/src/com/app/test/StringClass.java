 package com.app.test;

public class StringClass {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(1));
		System.out.println("\"test \" :"+s1.concat("Hello").hashCode());
		System.out.println(s1.compareTo("hello"));
		System.out.println(s1.compareToIgnoreCase("heLLO"));
		System.out.println(" jf "+s1.contains("He"));
		System.out.println(s1.contentEquals("hello"));
		System.out.println(s1.endsWith("Hello"));
		System.out.println(s1.codePointBefore(4));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.startsWith("y"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3, 5));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.getBytes());
		System.out.println(s1.valueOf("75"));
		System.out.println(s1.join("@", "raju", "yadav", "Boini"));
		byte[] b = s1.getBytes();
		char[] cr = s1.toCharArray();
		for (byte c : b) {
			System.out.println(c);
		}
		int count = 0;
		for (char cc : cr) {
			System.out.println(cc);
			count++;
		}
		System.out.println(s1.CASE_INSENSITIVE_ORDER.toString());
		System.out.println(s1.length());
		System.out.println(count);
		System.out.println(s1.valueOf("c"));
		System.out.println(s1.toUpperCase().matches("HELLO"));
		System.out.println(s1.regionMatches(2, "raHello", 5, 5));
		System.out.println(s1.replaceAll("llo", "RAju"));
		System.out.println(s1.replace("llo", "RAju"));
		String[] a = s1.replace("llo", "RAju").split("");
		for (String string : a) {
			System.out.println(string);
		}
	}
}
