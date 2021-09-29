package com.broadridge.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		  ArrayList<String> listofstr = new ArrayList<String>();
		  listofstr.add("Test");
		  listofstr.add("Java");
		  listofstr.add("Code");
		  

		   
		   System.out.println("Before Sorting:");
		   for(String counter: listofstr){
				System.out.println(counter);
			}

		  
		   Collections.sort(listofstr);

		   
		   System.out.println("After Sorting:");
		   for(String counter: listofstr){
				System.out.println(counter);
			}
		}
	}

