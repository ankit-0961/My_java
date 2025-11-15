package com.task_strings_and_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;


public class Coding_Questions {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String:");
		
		//1.Reverse a string.
		
//		StringBuffer aa=new StringBuffer("Ankit");
//		aa.reverse();
//		System.out.println(aa);

		//2. Check if a string is a palindrome. 
		
//		System.out.println("Enter the String:");
//		String str= sc.nextLine();
//		
//		StringBuffer aa=new StringBuffer(str);
//		
//		String reversed=aa.reverse().toString();
//		
//		if(str.equals(reversed)) {
//			System.out.println(str + " is a palindrome");
//			
//		}
//		else {
//			System.out.println(str + " is not a palindrome");
//		}
		
	//	4. Remove duplicate characters from a string. 
		
//		String str="programming";
//		String result="";
//		
//		for (int i=0;i<str.length(); i++) {
//			char ch=str.charAt(i);
//			
//			if (result.indexOf(ch)==-1) {
//				result=result+ch;
//			}
//		}
//		System.out.println("Original:"+ str);
//		System.out.println(" duplicates:"+ result);

		//5. Replace characters in a string.
		
//		String str ="Hello world";
//		
//		String result =str.replace("l","m" );
		
		//System.out.println("Original: " + str);
//        System.out.println("Modified: " + result);
		
		
	//	6. Find the number of occurrences of a substring in a string.
		
//		String str="hello world,hello everyone";
//		String sub="hello";
//		
//		int count =0;
//		int index=0;
//		
//		while((index=str.indexOf(sub,index))!=-1) {
//			count++;
//			index+=sub.length();
//		}
//		
//		System.out.println("Number of occurance:"+count);
		
	//	7. Check if two strings are anagrams. 
		
//		String word1="listen";
//		String word2="silent";
//		
//		word1 = word1.toLowerCase().replaceAll(" ", "");
//        word2 = word2.toLowerCase().replaceAll(" ", "");
//        
//        if(word1.length() != word2.length()) {
//            System.out.println("Not an anagram");
//           
//        }else { 
//            char[] w1= word1.toCharArray();
//            char[] w2= word2.toCharArray();
//            
//            Arrays.sort(w1);
//            Arrays.sort(w2);
//            
//            if(Arrays.equals(w1, w2)) {
//                System.out.println("Anagram");
//            } else {
//                System.out.println("Not an anagram");
//            }
//        
//        }
            
         ///////// 8. Capitalize the first letter of each word in a string.///////////
		
//		String str = "hello world from java";
//
//        StringBuffer sb = new StringBuffer(str);
//
//       
//        if (sb.length() > 0) {
//            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
//        }
//
//       
//        for (int i = 1; i < sb.length(); i++) {
//            if (sb.charAt(i - 1) == ' ') {
//                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
//            }
//        }
//
//        System.out.println(sb.toString());
            
            
       /////  9. Remove all whitespace from a string.////////
        
//        String str = "   Hello   World  Java ";
//
//       
//        String result = str.replaceAll("\\s", ""); 
//
//        System.out.println(result);
        
     //////   10. Check if one string is a rotation of another. /////////
  
//        String s1 = "ABCD";
//        String s2 = "CDAB";
//
//        
//        if (s1.length() != s2.length()) {
//            System.out.println("Not a rotation");
//        } else {
//           
//            String temp = s1 + s1;
//
//           
//            if (temp.contains(s2)) {
//                System.out.println("Yes, it is a rotation");
//            } else {
//                System.out.println("Not a rotation");
//            }
//        }
        
     ////   11. Find the largest and smallest elements in an array////
     
//        int[] arr = {5, 8, 2, 10, 3};
//
//       
//        int largest = arr[0];
//        int smallest = arr[0];
//
//      
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//            if (arr[i] < smallest) {
//                smallest = arr[i];
//            }
//        }
//
//        System.out.println("Largest element: " + largest);
//        System.out.println("Smallest element: " + smallest);
        
      // /// 12. Reverse an array without using an additional array. /////
 
//        int[] arr = {1, 2, 3, 4, 5};
//
//        int n = arr.length;
//        for (int i = 0; i < n / 2; i++) {
//           
//            int temp = arr[i];
//            arr[i] = arr[n - 1 - i];
//            arr[n - 1 - i] = temp;
//        }
//
//        
//        System.out.print("Reversed array: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
        }
       //// 13. Check if an array is sorted in ascending order. ///
       
//        public class CheckSortedArray {
//            public static void main(String[] args) {
//                int[] arr = {1, 2, 3, 4, 5};
//
//                boolean isSorted = true; 
//
//                for (int i = 0; i < arr.length - 1; i++) {
//                    if (arr[i] > arr[i + 1]) {
//                        isSorted = false;
//                        break; 
//                    }
//                }
//
//                if (isSorted) {
//                    System.out.println("Array is sorted in ascending order.");
//                } else {
//                    System.out.println("Array is not sorted in ascending order.");
//                }
//            }
	
	//////14. Count the frequency of each element in an array. ///////
       
	 
       
