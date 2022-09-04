package com.session4.regularExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String args[])
	{
		Queue<Integer> queue = new LinkedList<>();
		Integer array[] = {10,12,13,20};
		Collections.addAll(queue, array);
		
		//Array
		//queue.add(10);
		//queue.add(20);
		//queue.add(30);
		System.out.println(queue.peek());
		System.out.println(queue.poll());//removes peek and says what value is removed
		System.out.println(queue.peek());
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("next");
		Queue<Integer> pqueue = new PriorityQueue<>();
		Integer a[] = {10,12,13,20};
		Collections.addAll(pqueue, a);
		
		//Array
		//pqueue.add(10);
		//pqueue.add(20);
		//pqueue.add(30);
		System.out.println(pqueue.peek());
		System.out.println(pqueue.poll());//removes peek and says what value is removed
		System.out.println(pqueue.peek());
		//System.out.println(pqueue.poll());
		Iterator<Integer> iterator1 = pqueue.iterator();
		while(iterator1.hasNext())
			System.out.println(iterator1.next());
	}
		
}
