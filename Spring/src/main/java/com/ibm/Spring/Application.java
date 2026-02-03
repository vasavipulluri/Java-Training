package com.ibm.Spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.Spring.beans.JavaCollection;
import com.ibm.Spring.beans.SpellChecker;
import com.ibm.Spring.beans.TextEditor;
import com.ibm.Spring.config.BeanConfig;
import com.ibm.Spring.services.OrderService;

public class Application
{
	public static void main( String[] args )
	{
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
//		SpellChecker spellChecker=(SpellChecker) context.getBean("spellChecker");
		
//		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		
//		textEditor.spellCheck();
		
//		ClassPathXmlApplicationContext cpxaContext = (ClassPathXmlApplicationContext) context;
//		cpxaContext.registerShutdownHook();
		
//		SpellChecker spellChecker1=(SpellChecker) context.getBean("spellChecker1");
//		SpellChecker spellChecker2=(SpellChecker) context.getBean("spellChecker1");
//		SpellChecker spellChecker3=(SpellChecker) context.getBean("spellChecker1");
		
		
		
		
//		JavaCollection jc=(JavaCollection) context.getBean("javaCollection");
//		System.out.println("List Address");
//		List<String> listAddress =jc.getAddressList();
//		listAddress.forEach(System.out::println);
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//		textEditor.spellCheck();
//		System.out.println("End");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		OrderService orderService =(OrderService)context.getBean("orderService");
		orderService.makePayment(20000.52);
		System.out.println("End");
		
		
		
	}
}