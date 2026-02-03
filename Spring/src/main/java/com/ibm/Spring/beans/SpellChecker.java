package com.ibm.Spring.beans;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public SpellChecker() {
		System.out.println("Inside the SpellChecker constructor");
	}
	public void checkSpelling() {
		System.out.println("Inside checkSpelling");
	}

}
