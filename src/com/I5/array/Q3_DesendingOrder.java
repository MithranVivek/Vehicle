package com.I5.array;

import java.util.Arrays;

public class Q3_DesendingOrder {

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 1, 6, 8 };
		Arrays.sort(array);
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}

		System.out.println();
		// -----------------------------------------
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					max = array[i];
					array[i] = array[j];
					array[j] = max;
				}
			}
			System.out.print(array[i]);
		}

	}

}
