package com.I5.collection;

import java.util.Arrays;

public class Q4_SpaceCount {

	public static void main(String[] args) {

		String[] a = { "abc", " ", "bcd", " ", "def" };

		long count = Arrays.stream(a).filter(s -> s.trim().isEmpty()).count();
		System.out.println(count);

	}

}
