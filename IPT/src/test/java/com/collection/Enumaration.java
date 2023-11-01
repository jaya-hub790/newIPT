package com.collection;

import java.util.*;

public class Enumaration {
	private static String string;

	public static void main(String[] args) {
		Vector <String> v=new  Vector<String>();
		v.add("nimmy");
		v.add("dummy");
		v.add("chimmy");
		v.add("lux");
		v.add("rexona");
		v.add("humam");
		v.add("santoor");
		System.out.println(v);
		
		Enumeration<String> e = v.elements();
		System.out.println(e);
		while (e.hasMoreElements()) {
			String ne = e.nextElement();
			System.out.println(ne);
		}
		
	}

}
