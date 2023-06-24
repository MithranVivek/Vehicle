package com.I5.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_FiveFromAdding {

	public static void main(String[] args) {


//------------------------Using List Stream-----------------------------------------------------

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<String> pairs = values.stream()
				.flatMap(i -> values.stream().filter(j -> i + j == 5).map(j -> i.toString() + j.toString()))
				.collect(Collectors.toList());

		System.out.println(String.join(" ", pairs));

//-------------------------Using For Loop----------------------------------------------------

		List<Integer> has = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println();
		for (int i = 0; i < has.size(); i++) {
			for (int j = 0; j < has.size(); j++) {
				if (has.get(i) + has.get(j) == 5) {
					System.out.println(has.get(i) + "" + has.get(j));
				}
			}
		}
		
//-------------------------Using Array Stream------------------------------------------------------------------
		
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println();
		Arrays.stream(a).boxed().flatMap(i -> Arrays.stream(a).boxed().map(j -> new int[] { i, j }))
		.filter(pair -> pair[0] + pair[1] == 5)
		.forEach(pair -> System.out.println(pair[0] + "+" + pair[1] + "=5"));
	}

}
