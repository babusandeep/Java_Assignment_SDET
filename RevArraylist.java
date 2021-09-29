package com.broadridge.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class RevArraylist {

	 public static void main(String[] args)
	    {
	      
	        ArrayList<Integer> arrayli = new ArrayList<Integer>();
	 
	        
	        arrayli.add(new Integer(9));
	        arrayli.add(new Integer(145));
	        arrayli.add(new Integer(878));
	        arrayli.add(new Integer(343));
	        arrayli.add(new Integer(5));
	        System.out.print("Elements before reversing: ");
	        printElements(arrayli);
	 

	        Collections.reverse(arrayli);
	        System.out.print("\nElements after reversing: ");
	        printElements(arrayli);
	    }
	 
	    
	    public static void printElements(ArrayList<Integer> alist)
	    {
	        for (int i = 0; i < alist.size(); i++) {
	            System.out.print(alist.get(i) + " ");
	        }
	    }
	}