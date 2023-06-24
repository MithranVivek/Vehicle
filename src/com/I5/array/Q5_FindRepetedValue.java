package com.I5.array;

import java.util.HashSet;
import java.util.Set;

public class Q5_FindRepetedValue {

	public static void main(String[] args) {
		int[] a = { 1, 22, 22, 43, 2, 4, 5, 2, 43, 22 };

//-----------------------------------------------------		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
//--------------------------------------------------------		
		Set<Integer> uni = new HashSet<>();
		Set<Integer> dup = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			if (!uni.add(a[i])) {
				dup.add(a[i]);
			}
		}
		System.out.println(dup);
		dup.forEach(x->System.out.println(x));


	}
	
}
