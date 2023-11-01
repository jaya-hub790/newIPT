package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(23);
		l.add(98);
		l.add(20);
		l.add(3);
		l.add(8);
		l.add(67);
		l.add(76);
		l.add(54);
		System.out.println(l);
		
		
	    java.util.ListIterator<Integer> li = l.listIterator();
	    System.out.println("Forward Direction "+"\n"+"*******************");
	    while (li.hasNext()) {
	    	Integer next = li.next();
			System.out.println(next);
		}
	    System.out.println("Backward Direction "+"\n"+"*******************");
	    while (li.hasPrevious()) {
			Integer previous = li.previous();
			System.out.println(previous);
		}
	   
	    
		}
		
	}


