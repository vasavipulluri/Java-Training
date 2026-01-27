package com.ibm.typecasting;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class Application
{
	public static void main( String[] args )
	{
		float f=(float) 12.1;//explicit typecasting
		long l=10;// implicit typecating
		
		Calendar calender =new GregorianCalendar();
		System.out.println(calender.get(Calendar.DAY_OF_MONTH)); //Upcasting
		
		GregorianCalendar gregorianCalendar =(GregorianCalendar)calender;
		
		List<String> list= new LinkedList<String>();
		if(list instanceof ArrayList) {
			ArrayList<String> arrayList = (ArrayList<String>) list;
		}
	}
}