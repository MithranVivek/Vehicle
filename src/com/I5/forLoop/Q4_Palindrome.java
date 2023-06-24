package com.I5.forLoop;

public class Q4_Palindrome {

	public static void main(String[] args) {
		String a = "madam";
		String temp = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			temp = temp + a.charAt(i);
		}

		if (a.equals(temp)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
