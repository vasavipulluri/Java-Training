package com.ibm.lambdas;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lambda6 {

	public static void main(String[] args) {
		short s=123;
		try(DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("./src/main/resources/ibm/bifile1.txt")))){
					out.writeInt(s);
					System.out.println();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
