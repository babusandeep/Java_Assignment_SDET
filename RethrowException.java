package com.broadridge.assignment;

public class RethrowException {


		public static void main(String[] args) {

			String str="Hii";

			try {
				int val=Integer.parseInt(str);
			}
		
			catch(ArithmeticException e)
			{
				
				throw new NumberFormatException();
				
			}
				
				}
				}