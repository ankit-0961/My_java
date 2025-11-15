package com.Array;
import java.util.Scanner;

public class Third_code_Arrays {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
//		int [] a = new int [n];

//		System.out.println("Enter the number of  student");
//		int n =scan.nextInt();
//		
//		int[] a =new int[n];
//		
//		for (int i=0;i<a.length;i++) {
//		System.out.println("Enter the age of student "+i);
//	a[i]=scan.nextInt();
//		
//		}
//		for (int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}

		
////////////////////////////////two dimensional for loop/////////////////////
//System.out.println("Enter number of classes");
//int n=scan.nextInt();
//System.out.println("Enter number of students");
//int m=scan.nextInt();
//
//int[][] a = new int [n][m];
//
//for(int i=0;i<a.length;i++)
//{
//for(int j=0;j<a[i].length;j++) 
//{
//System.out.println("Enter the age of class"+i+" "+"student"+j);
//
//a[i][j]=scan.nextInt();
//}
//}
//for(int i=0;i<a.length;i++)
//{
//for(int j=0;j<a[i].length;j++) 
//{
//System.out.print(a[i][j] +" ");
//
//}
//System.out.println();
//}
		
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

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++) 
{
for (int k=0;k<a[i][j].length;k++)
{
System.out.print(a[i][j][k]+" ");
//a[i][j][k]=scan.next
}
System.out.println();
}
}
	}

}
		
		
		
		
