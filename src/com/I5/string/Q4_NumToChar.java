package com.I5.string;

public class Q4_NumToChar {

	public static void main(String[] args) {
		String s = "a1b2c3";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				int a = Character.getNumericValue(ch[i]);
				for(int j=0;j<a;j++) {
					System.out.println(ch[i-1]);
				}
			}
		}

	}

}
