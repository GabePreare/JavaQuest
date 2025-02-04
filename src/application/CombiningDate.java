package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CombiningDate {

	public static void main(String[] args) {
		LocalDate someDay = LocalDate.of(2020, 3, 19);
		System.out.println("Some Day: " + someDay);
		
		LocalTime someTime = LocalTime.of(12, 45);
		System.out.println("Some Time: " + someTime);
		
		
		//Combine Time into the Date
		LocalDateTime someDateTime = someDay.atTime(someTime);
		System.out.println("Some DateTime: " + someDateTime);
		
		//Combine Date into the Time
		LocalDateTime someTimeDate = someTime.atDate(someDay);
		System.out.println("Some Time Date: " + someTimeDate);
		
		//Extracting only the date from DateTime
		LocalDate whatWasTheDate = someDateTime.toLocalDate();
		System.out.println("What was the Date: " + whatWasTheDate);
		
		//Extracting only the time from DateTime
		LocalTime whatWasTheTime = someTimeDate.toLocalTime();
		System.out.println("What was the time: " + whatWasTheTime);
		
		//Extract only selected portion from date and time
		int year = whatWasTheDate.getYear();
		Month month = whatWasTheDate.getMonth();
		int hour = whatWasTheTime.getHour();
		
		System.out.println("\nYear: " + year);
		System.out.println("Month: " + month);
		System.out.println("Hour: " + hour);

	}

}
