package com.broadridge.assignment;

import java.util.HashMap;
import java.util.Map;

public class Keyhashmap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Hi");
		map.put(2,"Hi");
		System.out.println(map.containsKey(2));
		

	}

}
