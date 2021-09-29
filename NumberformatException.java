package com.broadridge.assignment;

public class NumberformatException  {

	public static void main(String[] args) {

String str="Hii";

try {
	int val=Integer.parseInt(str);
}
catch(NumberFormatException e)
{
	System.out.println("Cannot convert string type to interger type");
	
}
	
	}
	}