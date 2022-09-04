package com.collectoin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedDemo {
public static void main(String args[])
{
	SortedSet<String> s = new TreeSet<>();
	s.add("a");
	s.add("b");
	s.add("c");
	s.add("d");
	System.out.println(s);
	s.remove("c");
	s.add("o");
	System.out.println(s);
	SortedSet<String> desc =((TreeSet<String>) s).descendingSet();
	System.out.println(desc);
	
	
	Set<String> hash = new HashSet<>();
	hash.add("a");
	hash.add("b");
	hash.add("c");
	hash.add("d");
	System.out.println(hash);
	hash.remove("c");
	hash.add("hjh");
	Iterator<String> iterator1 = hash.iterator();
	while(iterator1.hasNext())
		System.out.println(iterator1.next());
	
	Set<String> hash1 = new LinkedHashSet<>();
	hash1.add("asdfsdf");
	hash1.add("bsdfsd");
	hash1.add("cer");
	hash1.add("d");
	System.out.println(hash1);
	hash1.remove("d");
	hash1.add("hjh");
	Iterator<String> i1 = hash1.iterator();
	while(i1.hasNext())
		System.out.println(i1.next());
	
	
}
}
