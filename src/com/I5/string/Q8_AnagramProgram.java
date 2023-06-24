package com.I5.string;

import java.util.Arrays;

public class Q8_AnagramProgram {

	public static void main(String[] args) {
		String a = "heat";
		String b = "thea";
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		if (c.length == d.length) {
			Arrays.sort(c);
			Arrays.sort(d);
			boolean equals = Arrays.equals(c, d);
			if (equals) {
				System.out.println("Given Strings are ANAGRAM");
			} else {
				System.out.println("Given Strings are Not ANAGRAM");

			}
		} else {
			System.out.println("Given Strings are Not ANAGRAM");

		}
	}

}
