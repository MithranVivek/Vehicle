package com.I5.string;

public class Q9_StringCalculator {

	public static void main(String[] args) {
		String a = "2-1+3";
		String[] b = a.split("[-]");
		String[] c = b[1].split("[+]");
		int d = Integer.parseInt(b[0]);
		int e = Integer.parseInt(c[0]);
		int f = Integer.parseInt(c[1]);
		System.out.println(d - e + f);
	}

}
