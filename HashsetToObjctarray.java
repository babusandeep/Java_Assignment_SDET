package com.broadridge.assignment;

import java.util.HashSet;
import java.util.Set;

public class HashsetToObjctarray {

	public static void main(String[] args) {
		 Set<Integer> s = new HashSet<>();
	      s.add(22);
	      s.add(4);
	      s.add(55);
	    
	      System.out.println(s);
	     
	      Object[] obArr = s.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);

	}

}
