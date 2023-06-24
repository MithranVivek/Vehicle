package com.I5.forLoop;

public class Q8_Armstrong {

	public static String findAmstrong(int no) {
		int temp = no, i, j = 0;
		while (no > 0) {
			i = no % 10;
			j = j + (i * i * i);
			no = no / 10;
		}
		if (temp == j) {
			return "Armstrong no";
		} else {
			return "Not Armstrong no";
		}
	}

	public static void main(String[] args) {
		System.out.println(findAmstrong(153));
	}

}
