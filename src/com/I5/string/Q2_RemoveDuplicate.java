package com.I5.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q2_RemoveDuplicate {
	
	public static void main(String[] args) {
		String a = "java program java is best";
		
		Map<Character, Integer> dup = new LinkedHashMap<>();
		
		for(int i=0;i<a.length();i++) {
			if(dup.containsKey(a.charAt(i))) {
				int count = dup.get(a.charAt(i));
				dup.put(a.charAt(i), count+1);
			}
			else {
				dup.put(a.charAt(i), 1);
			}
		}
		System.out.println(dup);
		
		dup.forEach((x,y)->{
			if(y>1) {
				System.out.println(x);
			}
		});
		
//		for(Map.Entry<Character, Integer> x : dup.entrySet()) {
//			if(x.getValue()>1) {
//				System.out.println(x.getKey());
//			}
//		}
	}

}
