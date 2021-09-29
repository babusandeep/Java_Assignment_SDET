package com.broadridge.assignment;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[]=new int []{12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
		}


	}

}
