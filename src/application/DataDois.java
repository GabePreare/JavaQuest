package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataDois {

	public static void main(String[] args) {
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter format4 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate dataLocal = LocalDate.parse("2025-01-30");
		LocalDateTime dataDetalhada = LocalDateTime.parse("2025-01-30T12:15");
		Instant dataIng = Instant.parse("2025-01-30T18:24:25Z");
		
		System.out.println("A data local: "+dataLocal);
		System.out.println("A data detalhada: " + dataDetalhada);
		System.out.println("A data na inglaterra: " + dataIng);
		
		//Alterando o formato do output
		System.out.println("\nData no padrão Brasileiro: " + dataLocal.format(format1));
		//Também funciona assim
		//System.out.println("\nData no padrão Brasileiro: " + format1.format(dataLocal));
		
		
		System.out.println("\nData detalhada formatada: " + dataDetalhada.format(format2));
		//Também funciona assim
		//System.out.println("\nData detalhada formatada: " + format2.format(dataDetalhada));
		
		//Quando for utilizar Instant, é necessário especificar o fuso-horário
		System.out.println("\nData formatada em Londres: " + format3.format(dataIng));
		
		//IsoDateTime
		System.out.println("\nIso Date Time: " + format4.format(dataIng));
	}

}
