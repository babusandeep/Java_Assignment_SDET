package com.broadridge.assignment;

public class StrtoChar {
	

	public static void main(String[] args) {
		
		String str="Hello";
		char ch[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		String str1=String.valueOf(ch);
		System.out.println();
		System.out.print(str1);
		

	}

}
