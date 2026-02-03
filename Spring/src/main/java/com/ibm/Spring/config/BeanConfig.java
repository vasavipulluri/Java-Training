package com.ibm.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.Spring.beans.SpellChecker;
import com.ibm.Spring.beans.TextEditor;


@Configuration
public class BeanConfig {
	@Bean("textEditor")
	public TextEditor getTextEditor() {
		return new TextEditor();
	}
	@Bean
	public SpellChecker getSpellChecker() {
		return new SpellChecker();
	}
}
