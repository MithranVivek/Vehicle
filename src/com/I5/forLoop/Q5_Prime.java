package com.I5.forLoop;

public class Q5_Prime {
	
	public static String primeOr(int no) {
		boolean prime = true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				prime = false;
			}
		}
		if(prime == true) {
			return "Prime No";
		} else {
			return "Not Prime No";			
		}
	}

	public static void main(String[] args) {
		
		System.out.println(primeOr(4));
	}

}
