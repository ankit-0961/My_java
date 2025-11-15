package com.task;
import java.util.Scanner;
public class Loop_Based_challenges {

	public static void main(String[] args) {
///////////////6. Factorial of a Number – Compute the factorial of a number using a loop.///////////////// 

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n=sc.nextInt();
//		
//		int fact=1;
//		
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println("factorial of " + n  + " is:"+fact);
//		
		
//////////////////Reverse a Number – Reverse the digits of a number using a loop.////////////////
	
//		System.out.println("Enter the Number :");
//		int num=sc.nextInt();
//		
//		int rev=0;
//		
//		while(num>0) {
//			int digit = num % 10;      
//            rev = rev * 10 + digit;     
//            num = num / 10;   
//		}
//		 System.out.println("Reversed Number = " + rev);
		 
//////////// Palindrome Number – Check if a given number is a palindrome (same forward and backward).////////


		
//		int number = 121;    
//        int original = number; 
//        int reversed = 0;
//
//        
//        while (number != 0) {
//            int digit = number % 10;          
//            reversed = reversed * 10 + digit;  
//            number = number / 10;             
//        }
//
//        // check if reversed is same as original
//        if (original == reversed) {
//            System.out.println(original + " is a palindrome number.");
//        } else {
//            System.out.println(original + " is not a palindrome number.");
//        }
//        
        
///////////////// Armstrong Number – Check if a number is an Armstrong number (e.g., 153 = 1³ + 5³ + 3³). //////////////////

//        int number = 153;     
//        int original = number;
//        int sum = 0;
//
//        while (number != 0) {
//            int digit = number % 10;       
//            sum = sum + (digit * digit * digit); 
//            number = number / 10;          
//        }
//
//        if (original == sum) {
//            System.out.println(original + " is an Armstrong number.");
//        } else {
//            System.out.println(original + " is not an Armstrong number.");
//        }
        
        
       /////// . Print Fibonacci Series – Print the Fibonacci sequence up to a given number. //////////
       
        int n = 10; 
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");  
            int next = first + second;     
            first = second;                
            second = next;
        }
	}
}
