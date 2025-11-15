package com.Strings;

public class String_buffer_method {

	public static void main(String[] args) {
		
	//1.append()-Adds text at the end of the existing string.
		
		StringBuffer sc= new StringBuffer ("Hello ");
		sc.append("World");
		System.out.println(sc);
		
	//2.insert()-Inserts text at a specific position (index).
		
		StringBuffer st=new StringBuffer ("javascript programming");
		st.insert(10, " is");
		System.out.println(st);
		
	// 3.replace()-Replaces characters from start index to end index with new text.
		
		StringBuffer ss=new StringBuffer("I like Python");
		ss.replace(6, 13, " Java");
		System.out.println(ss);
		
	// 4.delete()-Deletes characters from start index to end index.
		
		StringBuffer tt=new StringBuffer("I Dont Like Java");
		tt.delete(2, 7);
		System.out.println(tt);
		
	// 5.reverse()-reverse the string.
		
		StringBuffer AA=new StringBuffer("Satyam");
		AA.reverse();
		System.out.println(AA);
		
	//6.charAt()-Returns character at given index.
		
		StringBuffer sv=new StringBuffer("java");
		System.out.println(sv.charAt(3));
		
	//7.length()-Returns the number of characters in string.
		
		StringBuffer s=new StringBuffer("God");
		System.out.println(s.length());
		
	//8.Substring()-Returns a part of the string (like String).
		
		StringBuffer sa=new StringBuffer("java Programming");
		System.out.println(sa.substring(0, 4));
		
		}

}
