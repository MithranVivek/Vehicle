package com.I5.array;

public class Q1_SumOfElement {
	
	public static int sumOfElements(int[] no) {
		int sum = 0;
		for(int i=0;i<no.length;i++) {
			sum= sum+no[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] no = {12,23,34,45,56};
		System.out.println(sumOfElements(no));
	}

}
