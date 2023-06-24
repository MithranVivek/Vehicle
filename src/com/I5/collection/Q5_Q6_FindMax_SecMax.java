package com.I5.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q5_Q6_FindMax_SecMax {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 4, 5, 77, 8, 444);

		Integer max = li.stream().sorted().max(Comparator.naturalOrder()).get();
		System.out.println(max);

		Integer first = li.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(first);
		
		Integer smax = li.stream().sorted(Collections.reverseOrder()).skip(1).max(Comparator.naturalOrder()).get();
		System.out.println(smax);
		
		Integer sfirst = li.stream().sorted().skip(li.size()-2).findFirst().get();
		System.out.println(sfirst);


	}
}
