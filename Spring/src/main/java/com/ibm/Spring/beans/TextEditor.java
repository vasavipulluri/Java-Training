package com.ibm.Spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("textEditor")
public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor() {
		System.out.println("Inside TextEditor no-args constructor");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker=spellChecker;
	}
	public void init() {
		System.out.println("Text editor Initialized");
	}
	public void destroy() {
		System.out.println("Text editor destroyed");
	}
	@Autowired
	@Qualifier("spellChecker2")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker=spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
