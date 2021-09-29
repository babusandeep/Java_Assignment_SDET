package com.broadridge.assignment;




public class Pyramid2Darray {

	public static void main(String[] args) {
		
	 
	     
	     int n=10,i,j,a[][];
	        
	     
	     a=new int[n][n];
	   
	        for(i=0;i<n;i++){
	            for(j=0;j<=i;j++)
	                if(j==0 || j==i)
	                    a[i][j]=1;
	                else
	                    a[i][j]=a[i-1][j-1]+a[i-1][j];
	        }
	        
	     
	        for(i=0;i<n;i++)
	        {
	        	 for ( j=n-i; j>1; j--)
	             {
	                 
	                 System.out.print(" ");
	             }
	            for(j=0;j<=i;j++)
	            {
	                System.out.print("0 ");
	            }
	            System.out.println();
	        }
	    }
	
		    }
		