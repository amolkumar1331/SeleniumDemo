package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
	
	public static void main(String[] args) {
		
		
		List<Integer>  list =  new LinkedList<Integer>();
		list.add(10);  //  Object ==  Integer i = new Integer(10); 
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		list.add(1, 100);
		System.out.println(list);
		
	}

}
