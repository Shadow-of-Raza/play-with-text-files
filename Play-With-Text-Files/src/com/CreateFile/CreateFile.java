package com.CreateFile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File myfile=new File("/Users/ansar/DemoFile/demo.text");
	
	if(myfile.createNewFile())
	{
		System.out.println("File created...");
	}
	else
	{
		System.out.println("Already exist...");
	}
	
	}
}
