package com.task;

public class Pattern_Programming_code {

	public static void main(String[] args) {
	
////////////////11. Print a Star Pyramid – Print a right-angled triangle using *. ////////////////////////////
//	
//		int n=5;
//		for(int i=1;i<=n;i++) 
//		{
//			for(int j=1;j<=i;j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
/////////////////////// Print an Inverted Pyramid – Print an inverted right-angled triangle. ////////////////////
	
//		int n =5;
//		for (int i=n;i>=1;i--) 
//		{
//			for (int j=1;j<=i;j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
/////////////////////// Print Floyd’s Triangle – Print a Floyd’s triangle pattern using numbers.//////////////////
	
//		int n=5;
//		int num =1;
//		for (int i=1;i<=n;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(num +" ");
//				num++;
//			}
//			System.out.println();
//		}
		
//////////////////////14. Diamond Star Pattern – Print a diamond shape using *.////////////////////////////
	
//		  int n = 5; 
//
//	       
//	        for (int i = 1; i <= n; i++) {
//	            
//	            for (int j = 1; j <= n - i; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int j = 1; j <= 2 * i - 1; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println(); 
//	        }
//	        
//	        for (int i = n - 1; i >= 1; i--) {
//	       
//	            for (int j = 1; j <= n - i; j++) {
//	                System.out.print(" ");
//	            }
//	           
//	            for (int j = 1; j <= 2 * i - 1; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
//////////////////////////// Print Pascal’s Triangle – Generate Pascal’s triangle using loops. ////////////////

	        int n = 6;

	        for (int i = 0; i < n; i++) {
	          
	            for (int s = 0; s < n - i; s++) {
	                System.out.print(" ");
	            }

	            int number = 1; 
	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + " ");
	                
	             
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	}

}
