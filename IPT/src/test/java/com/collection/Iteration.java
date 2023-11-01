package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Iteration {
	public static void main(String[] args) {
		//Set<String>s=new LinkedHashSet<String>();
		Vector<String>s=new Vector<String>();
		s.add("sanju");
		s.add("manju");
		s.add("Rathi");
		s.add("balu");
		s.add("vicky");
		s.add("kani");
		System.out.println(s);
		
		Iterator<String> iterator = s.iterator();
		while(iterator.hasNext())
		{
			String next = iterator.next();
			if (next.equals("manju")) {
				iterator.remove();
				
			}
			System.out.println(next);
		}
		System.out.println(s);
			
		}
	}


