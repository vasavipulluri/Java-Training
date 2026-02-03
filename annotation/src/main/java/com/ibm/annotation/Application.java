package com.ibm.annotation;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Application
{
	public static void main( String[] args ) {
		Class<CustomAnnotationUsage> clazz=CustomAnnotationUsage.class;
		CustomAnnotation classAnn=clazz.getAnnotation(CustomAnnotation.class);
		if(classAnn!=null) {
			printAnnotation("class",classAnn);
		}
	
			Constructor<?> constructor;
			try {
				constructor = clazz.getDeclaredConstructor();
				CustomAnnotation constrann=constructor.getAnnotation(CustomAnnotation.class);
				if(constrann!=null) {
					printAnnotation("Constructor", constrann);
				}
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private static void printAnnotation(String element, CustomAnnotation ann) {
		System.out.println("Element : "+element);
		System.out.println("Name : "+ann.name());
		System.out.println("Duration : "+ann.duration());
		System.out.println("version : "+Arrays.toString(ann.version()));
		System.out.println();
		
	}
}