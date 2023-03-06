package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate1 {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("Date :"+str );
		//String str1= "22/02/2022";
		//Date d1 = format.parse(str1);
		//System.out.println(d1);
	}

}
