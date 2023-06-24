package com.I5.string;

import java.util.Arrays;

public class Q3_Rearrange {

	public static void main(String[] args) {
		String a = "abcfed";
		char[] ch = a.toCharArray();
		Arrays.sort(ch);
		
		System.out.println(new String(ch));
	}

}
