package com.collectoin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class MapDemo {
public static void main(String[] args) {
	Map<Integer, String> hm = new HashMap<>();
	
	hm.put(1,"abc");
	hm.put(2,"tryuy");
	System.out.println(hm.containsKey(2));
	System.out.println(hm.get(1));
	System.out.println(hm);
	for(Map.Entry<Integer, String> entry:hm.entrySet())
	{
		System.out.println(entry.getValue() + " "+ entry.getKey());
	}
	System.out.println("using iterator");
	//check 
	//NavigableMap<Integer, String> d= hm.
	Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
	
	while(it.hasNext())
	{
		Map.Entry<Integer, String> entry = it.next();
		System.out.println(entry.getValue()+ " "+ entry.getKey());
	}
}
}
