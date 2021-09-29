package com.broadridge.assignment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaptoList {

	public static void main(String[] args) {
		 
		        Scanner sc = new Scanner(System.in);
		  
		
		        Map<String, String> map = new HashMap<String, String>();
		        System.out.println("Enter No of Students");
		  
		        
		        int noOfStudents = Integer.parseInt(sc.nextLine());
		        for (int i = 0; i < noOfStudents; i++) {
		            String input = sc.nextLine();
		            String[] studentdata = input.split(" ");
		            String rollno = studentdata[0];
		            String name = studentdata[1];
		            map.put(rollno, name);
		        }
		  
		       
		        Collection<String> ListofKeys = null;
		    
		        ListofKeys = map.keySet().stream().collect(Collectors.
		                                       toCollection(ArrayList::new));

		        System.out.println("List of RollNo of Students");
		        System.out.println(ListofKeys.toString());
		       
		    }
		}