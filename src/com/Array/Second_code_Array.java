package com.Array;
import java.util.Scanner;

public class Second_code_Array {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a+b);
		
		
	//////////////////////one  dimensional in for loop//////////////////
	
		
//int [] a = new int [5];

//System.out.println("Enter the number of  student");
//int n =scan.nextInt();
//
//int[] a =new int[n];
//
//for (int i=0;i<n;i++) {
//	System.out.println("Enter the age of student "+i);
//	a[i]=scan.nextInt();
//	
//}
//for (int i=0;i<n;i++) {
//	System.out.println(a[i]);
//}
	
		
		
////////////////////////////////two dimensional for loop/////////////////////

//		int n=scan.nextInt();
//		int m=scan.nextInt();
//		int[][] a = new int [n][m];
//		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<m;j++) 
//			{
//				System.out.println("Enter the age of class"+i+" "+"student"+j);
//				
//				a[i][j]=scan.nextInt();
//			}
//		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<m;j++) 
//			{
//				System.out.print(a[i][j] +" ");
//				
//			}
//			System.out.println();
//		}
		
///////////////////////////////////////////////Three dimensional Array///////////////////////////
		
		  int [][][] a =new int [2][3][5];
		  for(int i=0;i<2;i++)
		  {
			  for(int j=0;j<3;j++) 
			  {
				  for (int k=0;k<5;k++)
				  {
					  System.out.println("Enter school"+i+"class"+j+"students"+k);
					  a[i][j][k]=scan.nextInt();
				  }
			  }
		  }
		  
		  for(int i=0;i<2;i++)
		  {
			  for(int j=0;j<3;j++) 
			  {
				  for (int k=0;k<5;k++)
				  {
					  System.out.print(a[i][j][k]+" ");
//					  a[i][j][k]=scan.next
				  }
				  System.out.println();
			  }
		  }
	}

}
