package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {

	public static void main(String[] args) {
		//Estudando todas as formas de se trabalhar com date and time em java
		
		//Instanciando todos objetos
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalTime thisTime = LocalTime.now();
		System.out.println("This Time: " + thisTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current date time: " + currentDateTime);
		
		//Definindo as datas
		
		LocalDate someDay = LocalDate.of(2022,Month.APRIL,25);
		System.out.println("SomeDay: " + someDay);
		
		LocalTime someTime = LocalTime.of(12, 45);
		System.out.println("Some time: " + someTime);
		
		LocalDateTime otherDateTime = LocalDateTime.of(2024, Month.DECEMBER,15,11,30,25);
		System.out.println("Other dateTime: " + otherDateTime);
	}

}
