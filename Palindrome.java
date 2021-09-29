package com.broadridge.assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 
//		      String str, rev = "";
//		      Scanner sc = new Scanner(System.in);
//		 
//		      System.out.println("Enter a string:");
//		      str = sc.nextLine();
//		 
//		      int length = str.length();
//		 
//		      for ( int i = length - 1; i >= 0; i-- )
//		         rev = rev + str.charAt(i);
//		 
//		      if (str.equals(rev))
//		         System.out.println(str+" is a palindrome");
//		      else
//		         System.out.println(str+" is not a palindrome");
		 
		String str="SA1";
		int lenghth=str.length();
		char ch[]=new char[str.length()];
	//	System.out.print(lenghth);
		//for(int i=0;i<=lenghth-1;i++)
			for(int i=lenghth-1;i>=0;i--)
		{
			ch[i]=str.charAt(i);
//			System.out.println(str.charAt(i));
//			System.out.println(ch[i]);
			
		}
		
		//for(int i=0;i<ch.length;i++)
			for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
			System.out.println();
		String str2=String.valueOf(ch);
		System.out.println(str2);
		
		
		if (str.equals(str2))
		{
			  System.out.println(str+" is a palindrome");
		}
      else
      {
         System.out.println(str+" is not a palindrome");
      }
		   }
		}

