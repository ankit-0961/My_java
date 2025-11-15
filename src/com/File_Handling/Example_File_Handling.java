package com.File_Handling;

import java.io.*;
//import java.io.IOException;

public class Example_File_Handling {

	public static void main(String[] args)throws IOException {
		
		File file=new File("ankit.txt");
		
		file.createNewFile();
		
		FileWriter fw=new FileWriter(file,true);
		
		fw.write("Hello world");
		fw.write("i am learning java");
		System.out.println("file created");
		fw.close();
		
//		System.out.println(file.getName());
//		System.out.println(file.exists());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.length());
//		
//		file.delete();
		
//		if(file.createNewFile()) {
//			System.out.println("File created...");
//		}else {
//			System.out.println("File is not created..");
//		}

	}

}
