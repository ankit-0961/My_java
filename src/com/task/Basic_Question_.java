package com.task;
import java.util.*;

public class Basic_Question_ {

	public static void main(String[] args) {
		
///////////////////////////////Even or Odd – Check whether a given number is even or odd using if.//////////////////////////
	Scanner scan=new Scanner(System.in);
	
//	System.out.println("Enter the Number");
//	
//	int a=scan.nextInt();
//	
//	if(a % 2 == 0) {
//		System.out.println("Even Number");
//	}else {
//		System.out.println("Odd Number");
//	}
//	

	
///////////////Positive, Negative, or Zero – Determine if a number is positive, negative, or zero. ///////////////////

//	System.out.println("Enter the Number");
//	int num=scan.nextInt();
//	if(num < 0) {
//		System.out.println("Negative");
//	}else if(num>0){
//		System.out.println("Positive");
//	}else {
//		System.out.println("Zero");
//	}
//	
////////////////////////Largest of Three Numbers – Find the largest among three given numbers./////////////////////////

//	System.out.println("Enter the first Number");
//	int a=scan.nextInt();
//	
//	System.out.println("Enter the second Number");
//	int b=scan.nextInt();
//	
//	System.out.println("Enter the Third Number");
//	int c=scan.nextInt();
//	
//	if(a>=b && a>=c) {
//		System.out.println("Largest number is a");
//		
//	}else if(b>=c&& b>=a) {
//		System.out.println("Largest number is b");
//	}else {
//		System.out.println("Largest number is c");
//	}
	
///////////////////////4. Leap Year Check – Determine if a given year is a leap year. /////////////////////////////////

//    System.out.println("Enter a year:");
//    int year = scan.nextInt();
//
//    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//        System.out.println("Leap Year");
//    } else {
//        System.out.println("Not a Leap Year");
//    }
    
 //////////////////5. Sum of Digits – Find the sum of digits of a given number using a loop.//////////////////////////// 
	
	
	 int number = 1234; 
     int sum = 0;

     while (number != 0) {
         int digit = number % 10;  
         sum = sum + digit;       
         number = number / 10;     
     }

     System.out.println("Sum of digits = " + sum);
	
	}
}
