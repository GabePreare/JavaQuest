package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OperationsDateTime {

	public static void main(String[] args) {
		//Operations in Date and Time
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		LocalDateTime futureDateTime = currentDateTime
		.plusYears(1) //Add one year to current date and time
		.plusDays(2) //add two days
		.plusHours(3); //add three hours
		
		boolean isBefore = futureDateTime.isBefore(currentDateTime);//false
		
		boolean isAfter = futureDateTime.isAfter(currentDateTime);//true
		
		System.out.println(futureDateTime.toLocalDate() + " is before "+ currentDateTime.toLocalDate() +"? " + isBefore);
		System.out.println(futureDateTime.toLocalDate() + " is after " + currentDateTime.toLocalDate()+ " ?  " + isAfter );
	}

}
