package com.broadridge.assignment;

public class AvgArray {

	public static void main(String[] args) {
	
		double arr[]= new double[] {1,2,3,4,5,6};
		
		double sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[ i];
			
		}
		double avg=sum/arr.length;
		System.out.println(avg);
		
		
	}
}