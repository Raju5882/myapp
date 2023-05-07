package com.app.col;

public class Key {

	
	
	
      public Key() {
		System.out.println(" parent");
	}

	protected int var=10;
      
      public void test()
      {
    	  System.out.println(" parent x: "+var++);
      }
	
}
