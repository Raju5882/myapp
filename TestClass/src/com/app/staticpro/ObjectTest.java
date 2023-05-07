package com.app.staticpro;

public class ObjectTest {

	static int a=0,b=0;
	static
	{
		System.out.println(" static block");
	}
	ObjectTest()
	{
		System.out.println(" oject created :"+(++a));
		System.out.println(this.hashCode());
		
	}
	{
		System.out.println(" non static block  "+(++b));
		System.out.println(this.hashCode());
	}
	
	public static void main(String[] args) {
      new ObjectTest();
      new ObjectTest();
      new ObjectTest();
	}

}
