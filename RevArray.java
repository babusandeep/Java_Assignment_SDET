package com.broadridge.assignment;

public class RevArray {

	public static void main(String[] args) {
		int arr[]=new int [] {1,5,7};
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for (int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		

	}

}
