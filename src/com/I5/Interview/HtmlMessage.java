package com.I5.Interview;

public class HtmlMessage {

	public static void message() {
		String s1 = "<Body> <Display> Hi welcome <Message> sysvedha </Message> </Display></Body>";
		String[] split = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < split.length; i++) {
			if (!split[i].contains("<")) {
				sb.append(split[i]+" ");
//				sb.append(" ");
			}
		}
		String ms = sb.toString();
		System.out.println(ms.trim());

	}

	
	
	public static void main(String[] args) {
		message();
	}
	 
	 

}
