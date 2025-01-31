package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataTres {

	public static void main(String[] args) {
		LocalDate dataLocal = LocalDate.parse("2017-08-14");
		LocalDateTime dataPrecisa = LocalDateTime.parse("2026-03-07T12:00:26");
		Instant dataIng = Instant.parse("2027-05-25T15:30:24Z");
		
		LocalDate d1 = LocalDate.ofInstant(dataIng, ZoneId.systemDefault());
		LocalDate d2 = LocalDate.ofInstant(dataIng, ZoneId.of("Japan"));
		
		System.out.println(dataIng+"\n"+d1);
		System.out.println("\n"+dataIng+"\n"+d2);
		System.out.println("\nDia da dataLocal: " + dataLocal.getDayOfWeek());
		System.out.println("Mês da dataLocal: " + dataLocal.getMonth());
		System.out.println("Ano da dataLocal: " + dataLocal.getYear());
	}

}
