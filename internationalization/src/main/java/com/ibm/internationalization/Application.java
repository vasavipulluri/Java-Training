package com.ibm.internationalization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Application
{
	public static void main( String[] args )
	{
//		double d=123456.789;
//		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
//		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
//		
//		System.out.println("ITALY represntation of " + d + " : " + nf.format(d));
//		System.out.println("US represntation of " + d + " : " + nf1.format(d));
		
		Locale defaultLocale = new Locale("es");
		System.out.println(defaultLocale);
		System.out.println("Default Locale:");
		System.out.println("Language: " + defaultLocale.getLanguage());
		System.out.println("Country: " + defaultLocale.getCountry());
		System.out.println("Display Name: " + defaultLocale.getDisplayName());
		System.out.println("variant: " + defaultLocale.getVariant());
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages", defaultLocale);
		
		System.out.println("English: ");
		printMessages(resourceBundle);
		
	}
	
	private static void printMessages(ResourceBundle bundle) {
		System.out.println("Greetings: " + bundle.getString("greeting"));
		System.out.println("Question: " + bundle.getString("question"));
		System.out.println("Farewell: " + bundle.getString("farewell"));
	}
}