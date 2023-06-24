package com.I5.Interview;

public class TernaryOperator {
	
	public static void mobileNo(Long mobileNo) {
//		long mobileNo = 8015380379l;
		String mobile = String.valueOf(mobileNo);
		if(mobile.matches("\\d{10}")) {
			System.out.println(mobile);
		} else {
			System.out.println("Enter 10 digit");
		}
	}
	
	public static void main(String[] args) {
		String day = "SUNDAY";
		int opening_time = (day == "SUNDAY") ? 12 : 9;
		
		System.out.println(opening_time);
		
		mobileNo(8015380379l);
		
	}

}
