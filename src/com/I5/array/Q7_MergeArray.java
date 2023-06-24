package com.I5.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Q7_MergeArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 6, 2, 3, 5 };
		List<Integer> la = new ArrayList<>(Arrays.stream(a).boxed().collect(Collectors.toList()));
		List<Integer> lb = new ArrayList<>(Arrays.stream(b).boxed().collect(Collectors.toList()));
		List<Integer> lc = new ArrayList<>(Arrays.stream(a).boxed().collect(Collectors.toList()));
		List<Integer> ld = new ArrayList<>(Arrays.stream(b).boxed().collect(Collectors.toList()));
		
		la.removeAll(lb);
		ld.removeAll(lc);
		
		la.addAll(ld);
		
		Set<Integer> li = new TreeSet<>();
		li.addAll(la);
		
		System.out.println(la);
		System.out.println(li);

	}

}
