package com.I5.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q5_RemoveDuplicateReverse {
	
	public static void main(String[] args) {
		String val = "1,2,3,1,2,3";
		String[] spl = val.split(",");

		Set<String> dup = new HashSet<>(Arrays.asList(spl));
		List<String> rev = new ArrayList<>(dup);
		Collections.reverse(rev);
		String op = String.join(",", rev);
		System.out.println(op);
		
		
	}

}
