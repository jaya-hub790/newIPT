package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRemove {
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
		 ListIterator<Integer> li = l.listIterator();
		 while (li.hasNext()) {
		    	Integer next = li.next();
		    	System.out.println(next);
				if (next.equals(8)) {
					li.add(10);
					
				}
				else if (next.equals(76)) {
					li.set(70);
					
				}
				else if (next.equals(20)) {
					li.remove();
					
				}
				 
			}
		 System.out.println(l);
	}

}
