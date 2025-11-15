package com.loops;

public class First_code_loops {

	public static void main(String[] args) {
		
//print a serial number of 1 to 10
		
//		for (int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		
// print a backward number of 10 to 1
		
//		for(int i=10;i>0;i--) {
//			System.out.println(i);
//		}
		
//print odd numbers of 1 to 20
		
//		for (int i=1;i<=20;i+=2) {
//			System.out.println(i);
//		}
//		

 //print Even numbers of 0 to 20
		
//		for (int i=0;i<=20;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//  
//Print the multiplication table of 5 using a for loop.
//		for (int i=5;i<=50;i+=5) {
//			System.out.println(i);
//		}
		
//Print the square of numbers from 1 to 10.
//		for (int i=1; i<=10;i++) {
//			int square=i*i;
//					System.out.println("Square of " + i + "=" + square);
//		}

		
		
		/////////////////////////////////////////PATTERNS/////////////////////////////////////////////////////////
		   
//		*****
//		*****
//		*****
//		*****
//		*****
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		11111
//		22222
//		33333
//		44444
//		55555
		
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=5;j++) {
//				System.out.print(i+"");
//			}
//			System.out.println();
//		}
		
////    1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
        
        for (int i=1;i<=5;i++) {
        	for (int j=1;j<=5;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
        
        
        int n=5;
        for (int i=1; i<=n;i++) {
        	for (int j=1;j<=5;j++) {
        		if (i==1||i==n||j==1||j==n) {
        			System.out.print("* ");
        		}
        		else {
        			System.out.print("  ");
        		}
//        		System.out.println();
            	
        	}
        	System.out.println();
        	
        }
	}

}
