package com.ibm.classobjects;

import com.ibm.classobjects.mammals.Man;

public class Application
{
	public static void main( String[] args )
	{
		Man man=new Man();
		man.leftEye.color="Black";
		man.rightEye.color="Black";
		man.leftEye.power=1.0f;
		man.rightEye.power=1.0f;
	}
}