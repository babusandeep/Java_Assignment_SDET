package com.broadridge.assignment;

public class SortArrayascending {

	public static void main(String[] args) {
		int arr[]=new int [] {6,9,2,3,5,1,4};
		int temp = 0; 
		
		for(int i=0;i<arr.length;i++)

		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				
			{
				
				if(arr[i]>arr[j])
				{
			          temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }   
	            }   
	         
	        
				}
		System.out.println(); 
		
		 for (int i = 0; i < arr.length; i++) {   
	            System.out.print(arr[i] + " ");  
				
			}
		
	}
}


