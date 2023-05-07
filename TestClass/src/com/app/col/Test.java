package com.app.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {


		String str="PersistenDevelop";

		char c[]=str.toLowerCase().toCharArray();

		Map <Character,Integer> count =new HashMap<>();


		for (char d : c) {

			if (count.containsKey(d)) {

				count.put(d, count.get(d)+1);

			} else {
				count.put(d, 1);
			}

		}

		System.out.println(count);



		int[] array1 = {4, 2, 8, 9, 5, 1};
		int[] array2 = {0, 3, 7};

		// combine the two arrays
		int[] combinedArray = new int[array1.length + array2.length];
		int index = 0;

		//		for (int i : array1) { combinedArray[index++] = i; } for (int i : array2) {
		//			combinedArray[index++] = i; }
		//
		//		// sorting the combined array for (int i = 0; i < combinedArray.length; i++)
		//		{ for (int j = i+1; j < combinedArray.length; j++) { if (combinedArray[i] >
		//		combinedArray[j]) { int temp = combinedArray[i]; combinedArray[i] =
		//		combinedArray[j]; combinedArray[j] = temp; } } }


		for (int i : array1) {
			combinedArray[index++]=i;
		}

		for (int i : array2) {
			combinedArray[index++]=i;
		}

		for (int i = 0; i < combinedArray.length; i++) {
			for (int j = i+1; j < combinedArray.length; j++) {

				if(combinedArray[i]>combinedArray[j])
				{
					int temp=combinedArray[i];
					combinedArray[i]=combinedArray[j];
					combinedArray[j]=temp;
				}
			}
		}
		// print the sorted combined array
		for (int i : combinedArray) {
			System.out.print(i + " ");
		}

		System.out.println();
		List<String> list = new ArrayList<>();
		list.add("item1");
		list.add("item2");
		list.add("item3");

		 Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            String item = iterator.next();
	            System.out.println(item);
	            if (item.equals("item2")) {
	                list.remove(item); // this will cause ConcurrentModificationException
	            }
	        }
			
			        ArrayList<String> list2 = new ArrayList<>();
			        list2.add("item1");
			        list2.add("item2");
			        list2.add("item3");

			        ListIterator<String> listIterator = list2.listIterator();
			        while (listIterator.hasNext()) {
			            String item2 = listIterator.next();
			            System.out.println(item2);
			            if (item2.equals("item2")) {
			                listIterator.set("modified item");
			            }
			        }
			        System.out.println("After modification: " + list2);


	}
}
