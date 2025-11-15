package com.ExceptionHandler;

import java.util.Scanner;

public class Code_Example {

	public static void main(String[] args) {
		System.out.println("conn is Estd");
	Scanner scan=new Scanner(System.in);
	
	try {
	System.out.println("Enter the numerator");
	int a=scan.nextInt();
	System.out.println("Enter the Denominator");
	int b=scan.nextInt();
	int c=a/b;
	System.out.println(c);
	}
	catch(Exception e){
		System.out.println("Enter a non zero Denominator");
	}
	System.out.println("conn is terminated");

	}

}
