package com.I5.forLoop;

public class Q1_FizzBuss {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 6 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 6 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
		}

	}

}
