package com.I5.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q6_MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

//		for (int i = 0; i < arr.length; i++) {
//			if (a == arr[i]) {
//			} else {
//			System.out.println(a + " is Missing in array");
//			break;
//			}
//		}

// ----------------------------------------------------------
		Set<Integer> s = new HashSet<>();
		List<Integer> l = new ArrayList<>(Arrays.stream(arr).boxed().toList());

		for (Integer x : arr) {
			s.add(x);
		}

		boolean contains = s.contains(a);
		boolean contains2 = l.contains(a);
		System.out.println(contains);
		System.out.println(contains2);

// ----------------------------------------------------------

		Set<Integer> s1 = new HashSet<>();

		Arrays.sort(arr);
		int endnum = arr[arr.length - 1];
		int startnum = arr[0];
		System.out.println(endnum + " " + startnum);

		for (Integer x : arr) {
			s1.add(x);
		}

		for (int i = startnum; i <= endnum; i++) {
			if (!s1.contains(i)) {
				System.out.println(i);

			}

		}
	}

}
