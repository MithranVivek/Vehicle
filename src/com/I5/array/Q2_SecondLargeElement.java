package com.I5.array;

public class Q2_SecondLargeElement {
	
	public static int findSecondMax(int[] no) {
		int max = 0;
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]>no[j]) {
					max = no[i];
					no[i] = no[j];
					no[j] = max;
				}
			}
		}
		return no[no.length-2];
	}

	public static void main(String[] args) {
		int[] no = {87,12,67,23,78,34,45,56};
		System.out.println(findSecondMax(no));

	}

}
