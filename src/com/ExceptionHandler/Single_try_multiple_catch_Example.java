package com.ExceptionHandler;
import java.util.InputMismatchException;
import java.util.*;

public class Single_try_multiple_catch_Example {

	public static void main(String[] args) {
		System.out.println("connection is Estd");
		Scanner scan =new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
	        System.out.println("Enter the size of an array");
	        int size =scan.nextInt();
	        int []ar=new int[size];
	        System.out.println("enter the element");
	        int ele=scan.nextInt();
	        System.out.println("Enter the index");
	        int index = scan.nextInt();
	        ar[index]=ele;
	        ar=null;
	        System.out.println(ar[index]);
		}
		catch(ArithmeticException e) {
			System.out.println("Provide non-zero denpminator");
			
		}
		catch (NegativeArraySizeException nae) {
			System.out.println("provide positive array size");
		}
		catch (InputMismatchException  ime) {
			System.out.println("Provide only integers");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Provide valid index");
		}
		catch(Exception e) {
			System.out.println(" Invalid Input Try again ");
		}
		 {
			System.out.println("Connection is terminated");
		}

	}

}
