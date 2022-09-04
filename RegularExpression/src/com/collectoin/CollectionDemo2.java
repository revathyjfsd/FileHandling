package com.collectoin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionDemo2 {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		Integer array[] = {10,12,13,20};
		Collections.addAll(list, array);
		
		//Array
		list.add(10);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains(20));
		for(int i:list)
			System.out.println(i);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
