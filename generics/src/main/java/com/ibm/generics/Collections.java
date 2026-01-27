package com.ibm.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");
		arrayList.add("E");
		arrayList.add("D");
		
		Iterator<String> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			String text = iterator.next();
			System.out.println(text);
		}
	}

}
