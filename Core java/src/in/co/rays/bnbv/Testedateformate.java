package in.co.rays.bnbv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class Testedateformate {
	public static void main(String[] args) throws ParseException {
		Date d= new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		String str=format.format(d);
		System.out.println("Date:"+ str);
		String str1="08/08/1998";
		Date d1= format.parse(str1);
		System.out.println(d1);
		//time add
		
		
		
		
		
	}

}
