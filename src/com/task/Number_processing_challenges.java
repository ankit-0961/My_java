package com.task;
import java.util.Scanner;
public class Number_processing_challenges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		
		
////////////////////16. Count Digits in a Number – Count the number of digits in a given integer. ///////////////////


		
//		  int number = 12345; 
//	        int count = 0;
//
//	        
//	        if (number == 0) {
//	            count = 1;
//	        } else {
//	            
//	            while (number != 0) {
//	                number = number / 10; 
//	                count++;              
//	            }
//	        }
//
//	        System.out.println("Number of digits: " + count);
		
/////17. Find the Sum of Even and Odd Numbers – Calculate the sum of even and odd numbers in a given range./////////

//System.out.println("Enter a Number");
//		int n=sc.nextInt();
//		
//		int sumEven=0;
//		int sumOdd=0;
//		
//		for(int i=1;i<=n; i++) {
//			if(i % 2 == 0) {
//				sumEven=sumEven+1;
//			}else {
//				sumOdd=sumOdd+1;
//			}
//		}
//		
//		System.out.println("sumEven = "+sumEven );
//		System.out.println("sumOdd = "+sumOdd);
//	}
		
		////////. Count Digits in a Number – Count the number of digits in a given integer./////// 
		
	
//		 int number = 98765;  // You can change this number
//	        int count = 0;
//
//	        // If number is 0, it has 1 digit
//	        if (number == 0) {
//	            count = 1;
//	        } else {
//	            while (number != 0) {
//	                number = number / 10;  // Remove last digit
//	                count++;               // Increment count
//	            }
//	        }
//
//	        System.out.println("Number of digits = " + count);
//	    }

	
	/////17. Find the Sum of Even and Odd Numbers – Calculate the sum of even and odd numbers in a given range. //////

//	 int start = 1;
//     int end = 10;
//
//     int evenSum = 0;
//     int oddSum = 0;
//
//     for (int i = start; i <= end; i++) {
//         if (i % 2 == 0) {
//             evenSum += i; // add to even sum
//         } else {
//             oddSum += i;  // add to odd sum
//         }
//     }
//
//     System.out.println("Sum of even numbers = " + evenSum);
//     System.out.println("Sum of odd numbers = " + oddSum);
//
//}

/////////////18. Prime Number Check – Determine if a number is prime///////////////

//System.out.println("Enter the Number:");
//int num=sc.nextInt();
//
//boolean isprime=true;
//
//if(num<=1) {
//	isprime=false;
//}else {
//	for(int i=2;i<num;i++) {
//		if (num%i==0) {
//			isprime=false;
//			break;
//		}
//	}
//}
//if(isprime) {
//	System.out.println("is a prime");
//}else {
//	System.out.println("is not a prime");
//}

///19. Print Prime Numbers in a Range – Print all prime numbers between 1 and n.////////

		
//int n=10;
//
//for(int num=2;num<=n;num++) {
//	boolean prime=true;
//for (int i=2;i<num;i++) {
//	if(num%i==0) {
//		prime  =false;
//		break;
//	}
//}
//if(prime) {
//	System.out.println(num+"");
//}
//}
      
/////////////////20. Find the Greatest Common Divisor (GCD) – Compute the GCD of two numbers using loops.////////////

//System.out.println("Enter the Name:");	
//int num1=sc.nextInt();
//
//System.out.println("Enter the Name:");
//int num2=sc.nextInt();
//
//int Gcd = 1;
//
//for(int i=1;i<=num1 && i<=num2;i++) {
//	if(num1%i==0 && num2%i==0) {
//		Gcd=i;
//	}
//}
//System.out.println("Gcd of"+num1+"and"+num2+"is"+Gcd);
	}

}
