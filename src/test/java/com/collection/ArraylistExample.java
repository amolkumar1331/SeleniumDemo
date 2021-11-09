package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
	
	public static void main(String[] args) {
		
		List<String>  list = new ArrayList<String>();  // 1000
		list.add("B");
		list.add("A");
		list.add(null);
		list.add("C");
		list.add("D");
		list.add(null);
		list.add("B");
		list.add("A");
		list.add("B");
		list.add("A");
		list.add(null);
		list.add("C");
		list.add("D");
		System.out.println(list);
		
		String value =list.get(1);
		System.out.println("Before :"+value);
		
		list.add(1, "Z");
		System.out.println(list);
		
		String v =list.get(1);
		System.out.println("After :"+v);
		
		list.remove(1);
		System.out.println(list);
		
	}

}
