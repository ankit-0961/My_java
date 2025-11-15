package com.Array;
import java.util.Scanner;
public class Fourth_code_Array {

	public static void main(String[] args) {
    
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number of classes");
		int n=scan.nextInt();
		
		System.out.println("Enter the number of students in class 0");
		int m1=scan.nextInt();
		
		System.out.println("Enter the number of students in class 0");	
		int m2=scan.nextInt();
		
		int[][] a = new int [n][];
		
		a[0]= new int [m1];
		a[1]= new int [m2];
		
		
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++) 
		{
		System.out.println("Enter the age of class"+i+" "+"student"+j);
		
		a[i][j]=scan.nextInt();
		}
		}
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++) 
		{
		System.out.print(a[i][j] +" ");
		
		}
		System.out.println();
		}
	}

}
