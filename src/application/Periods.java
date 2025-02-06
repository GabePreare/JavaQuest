package application;

import java.time.*;

public class Periods {

	public static void main(String[] args) {
		//Instants, Durations, and Periods in Java
		
		//GetCurrentDate
		LocalDate today = LocalDate.now();
		
		//Christmas Date of 2021
		LocalDate christmasDateOfThatYear = LocalDate.of(2025, Month.DECEMBER, 25);
		
		//Calculate the period left from the current date to christmas;
		Period howLongForChristmas = Period.between(today, christmasDateOfThatYear);
		
		int years = howLongForChristmas.getYears();
		int months = howLongForChristmas.getMonths();
		int days = howLongForChristmas.getDays();
		
		System.out.println("How long for the next Christmas?");
		System.out.println("\nYears: " + years);
		System.out.println("Months: " + months);
		System.out.println("Days: " + days);

	}

}
