package com.I5.string;

public class Q10_InsertString {

	public static void main(String[] args) {
		String name1 = "JAVA";
		String name2 = "developer";
		String name3 = "";
		for(int i=0;i<name1.length();i++) {
			name3 = name3+name1.charAt(i);
			if(i==name1.length()/2-1) {
				name3 = name3+name2;
			}
		}
		System.out.println(name3);

		StringBuilder sb = new StringBuilder(name1);
		sb.insert(2, name2);
		System.out.println(sb);
	}

}
