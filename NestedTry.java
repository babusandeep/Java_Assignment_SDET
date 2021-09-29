package com.broadridge.assignment;

public class NestedTry {

	public static void main(String[] args) {

try {
	
	System.out.println("Outer try block");
	
	try {
		System.out.println("Inner try block");
		int i=2/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("inner catch block");
		
	}
}

catch(Exception ae)
{
	System.out.println("Outer catch block");
}
	}

}
