package com.app.staticpro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.RandomAccess;

public class TestObj {


	public static void main(String[] args) {
		System.out.println( System.currentTimeMillis());
		
		Integer a[]= {1,2,3,4,5,6};
		System.out.println(a);
        for (Integer integer : a) {
			System.out.println(integer);
		}
        System.out.println("---------");
        Collections.reverse(Arrays.asList(a));
        for (Integer integer : a) {
			System.out.println(integer);
		}
        TestObj t=new TestObj();
        t=null;
        System.gc();
        System.out.println( System.currentTimeMillis());
        
        Random r=new Random();
        
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("ok Done");
	}
}
