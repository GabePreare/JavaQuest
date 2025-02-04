package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Date_Study {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat d01 = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat d02 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Calendar datas = Calendar.getInstance();
		
		Date data = new Date();
		
		Date data1 = d01.parse("26/04/2002");
		Date data2 = d02.parse("15/08/2025 12:30:15");
		
		System.out.println("Data 1: " + data1);
		System.out.println("Data 2: " + data2);
	}

}
