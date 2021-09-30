package com.broadridge.assignment;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;


public class MaptoList2 {

	public static void main(String[] args) {
		 

		 Map<Integer, String> myMap = new HashMap<>();
	        myMap.put(10, "have ");
	        myMap.put(21, "a ");
	        myMap.put(32, "great");
	        myMap.put(42, "day");
	        ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
	        ArrayList<String> valueList = new ArrayList<String>(myMap.values());
	        System.out.println("contents of the list holding keys the map ::"+keyList);
	        System.out.println("contents of the list holding values of the map ::"+valueList);
		    }
		}