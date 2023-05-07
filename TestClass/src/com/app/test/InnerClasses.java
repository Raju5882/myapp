package com.app.test;

abstract class AbstractClass
{
    abstract void methodOne();
 
    abstract void methodTwo();
}
 
interface InterfaceClass
{
    abstract void methodOfInterface();
}
 
public class InnerClasses
{
    public static void main(String args[])
    {
        //Implementing abstract class
        AbstractClass a = new AbstractClass()
        {
            @Override
            void methodOne()
            {
                System.out.println("From AbstractClass");
 
            }
 
            //You have to override second abstract method also,
            //otherwise, you will get compile time error.
            @Override
            void methodTwo()
            {
                System.out.println("From AbstractClass");
            }
        };
        a.methodOne();
        a.methodTwo();
 
        //Implementing Interface
     new InterfaceClass() {
			@Override
			public void methodOfInterface() {

				
				System.out.println(" from interface ");
			}
		}.methodOfInterface();
    }
}
