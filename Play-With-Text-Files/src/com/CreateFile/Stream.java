package com.CreateFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Stream 
{
	public static void main(String[] args) throws IOException
	{
		
		OutputStream os=new FileOutputStream("/Users/ansar/DemoFile/demo.text");
		os.write(70);		
		os.write(65);
		os.write(78);
		os.close();
		System.out.println("Data added successfully...");
		
	}
}
