package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Mudando a formatação da data (Antes era yyyy/MM/dd)
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		//Data atual
		LocalDate dataAtual = LocalDate.now();
		
		//Data atual definida pelo usuário
		//LocalDate dataDefinida = LocalDate.of(2002, 04, 26);
		//LocalDate dataDefinida = LocalDate.parse("2002-04-26");
		LocalDate dataDefinida = LocalDate.parse("26/04/2002", fmt1);
		
		//Data atual mais detalhada
		//LocalDateTime dataMais = LocalDateTime.now();
		//LocalDateTime dataMais = LocalDateTime.of(2005, 05, 11, 12, 30);
		//LocalDateTime dataMais = LocalDateTime.parse("2022-08-26T13:15:25");
		LocalDateTime dataMais = LocalDateTime.parse("12/12/2012 12:12", fmt2);
		
		//Data atual na Inglaterra
		//Instant precisamente = Instant.now();
		Instant precisamente = Instant.parse("2022-08-26T13:15:25Z");
		Instant quasePrecisamente =  Instant.parse("2022-08-26T13:15:25-03:00");
		
		//
		
		System.out.println("A data atual é: "+ dataAtual);
		System.out.println("A data atual com mais detalhes é: " + dataMais);
		System.out.println("A data definida: " + dataDefinida);
		System.out.println("1° Teste do Instant: " + precisamente);
		System.out.println("2° Teste do Instant: " + quasePrecisamente);
	
		
		scan.close();
	}
}
