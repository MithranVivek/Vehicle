package com.I5.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6_DateFormat {

	public static void main(String[] args) {
		String date = "1/2/2342";
		try {
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(date + "\n" + date1);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
	}

}
