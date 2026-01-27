package com.ibm.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		List<String> result = new LinkedList<String>();
		result.add("A");
		result.add("C");
		result.add("B");
		result.add("E");
		result.add("D");
		
		Iterator<String> iterator = result.iterator();
		
		while(iterator.hasNext()) {
			String text = iterator.next();
			System.out.println(text);
		}
	}

}