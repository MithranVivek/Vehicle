package com.I5.Basic;

public class Incremental {
	
	public static void main(String[] args) {
		int num = 1;
		int a = num;
		int b = a++ + ++a + --a;
		System.out.println(b);
		
	}

}
