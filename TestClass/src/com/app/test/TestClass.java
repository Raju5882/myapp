package com.app.test;

public class TestClass {

	public static void main(String[] args) {

	String s="rajubhai";
	String r="";
	
	System.out.println("Original String :"+s);
	for (int i = s.length()-1; i >= 0; i--) {
		//r=r+s.charAt(i);
	}
	
		System.out.println("Resverse String :"+r);
		
		
		  char a[] =s.toCharArray();
		  
		  for (int i = a.length-1; i >=0 ; i--) {
			r+=a[i];
			
		}
		 

		  System.out.println(s.join(",","teest1","TEST2","TEST3" ));
		  System.out.println("Resverse String :"+r);
		System.out.println(s.subSequence(1, 5));
		System.out.println(s.indexOf("b"));
	}

	

}
