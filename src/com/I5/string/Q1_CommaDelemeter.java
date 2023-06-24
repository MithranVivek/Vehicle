package com.I5.string;

import java.util.StringJoiner;

public class Q1_CommaDelemeter {
	
	public static void main(String[] args) {
		String a = "vivek";
		String b = "babu";
		StringJoiner sj = new StringJoiner(",");
		sj.add(a);
		sj.add(b);
		System.out.println(sj);
	}

}
