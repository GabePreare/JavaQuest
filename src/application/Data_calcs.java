package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data_calcs {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2025-04-26");
		LocalDateTime d02 = LocalDateTime.parse("2024-04-26T12:30");
		Instant d03 = Instant.parse("2025-04-26T15:15:23Z");
		
		//LocalDate d01 a week ago
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		//LocalDate lastWeekLocallDate = d01.minusWeeks(1);
		
		//LocalDate d01 next week
		
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		//LocalDate nextWeekLocalDate = d01.plusWeeks(1);
		
		
		//LocalDateTime nextWeek
		
		//LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		//LocalDateTime nextWeekLocalDateTime = d02.plusWeeks(1);
		
		//LocalDateTime previousWeek
		
		//LocalDateTime lastWeekLocalDateTime = d02.minusDays(7);
		//LocalDateTime lastWeekLocalDateTime = d02.minusWeeks(1);
		
		
		//Instant nextWeek
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		//Instant lastWeek
		Instant lastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		
		
		/**System.out.println("Today: " + d01);
		System.out.println("Next week: " + nextWeekInstant);
		System.out.println("Last week: " + lastWeekInstant);*/
		
		//Duração de duas datas definidas
		Duration t1 = Duration.between(lastWeekInstant, nextWeekInstant);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
		
		System.out.println("\nA duração de: "+ lastWeekInstant + " para "+ nextWeekInstant +" é de: "+t1.toDays() + " dias.");
		System.out.println("Comparação de: " +  pastWeekLocalDate + " e "+ nextWeekLocalDate + " é de: " + t2.toDays()+" dias.");
		
	}
}
