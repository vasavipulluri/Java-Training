package com.ibm.lambdas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Lambda5 {

	public static void main(String[] args) {
		FileInputStream in =null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("./src/main/resources/ibm/file1.txt");
			out =new FileOutputStream("./src/main/resources/ibm/file2.txt");
			byte c;
			
			while ((c=(byte) in.read()) != -1) {
				out.write(c);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in !=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in !=null) {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}

	}

}
