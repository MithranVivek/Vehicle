package com.I5.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Q7_FindDuplicateInsertionOrder {

	public static void main(String[] args) {
		String paragraph = "i am working as a java developer";
		String[] space = paragraph.split(" ");
		String rs = "";
		for (int i = 0; i < space.length; i++) {
			rs = rs + space[i];
		}
		System.out.println(rs);

		Map<Character, Integer> dup = new LinkedHashMap<>();
		for (Character x : rs.toCharArray()) {
			if (dup.containsKey(x)) {
				int count = dup.get(x);
				dup.put(x, count + 1);
			} else {
				dup.put(x, 1);
			}
		}
		dup.forEach((x, y) -> {
			if (y > 1) {
				System.out.print(x);
			}
		});

		System.out.println("\n" + findDuplicatescharacter(paragraph));

	}

//	for single character
	public static Set<Character> findDuplicatescharacter(String str) {
		Set<Character> unique = new HashSet<>();
		Set<Character> duplicates = new LinkedHashSet<>();
		for (Character x : str.toCharArray()) {
			if (!unique.add(x)) {
				duplicates.add(x);
			}
		}
		return duplicates;
	}

//	for words
	public static Set<String> findDuplicatesString(String str) {

		Set<String> unique = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		String[] words = str.split(" ");
		for (String x : words) {
			if (!unique.add(x)) {
				duplicates.add(x);
			}
		}
		return duplicates;
	}

}
