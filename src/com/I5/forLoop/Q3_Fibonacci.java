package com.I5.forLoop;

public class Q3_Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		
		for (int i = 0; i < 8; i++) {
			System.out.println(a);
			a = b;
			b = a + c;
			c = a;
		}

	}

}
