package application;

import java.time.*;

public class ZonedDateTimes {

	public static void main(String[] args) {

		// Get the time zone set to the PC running the app/ Java
		ZoneId systemZone = ZoneId.systemDefault();
		
		//Setting a past Time and Date
		LocalDateTime pastDateTime = LocalDateTime.of(2022, Month.APRIL,26,14,30);
		System.out.println("Past DateTime: " + pastDateTime);
		
		//Setting the zone to Berlin, Germany
		ZoneId berlinZone = ZoneId.of("Europe/Berlin");
		
		//Setting the Zone do Denver, Colorado - USA
		ZoneId denverZone = ZoneId.of("America/Denver");
		System.out.println(denverZone);
		
		//Mapping the Date and Time with the Zone,(2022 April 26, berlin)
		ZonedDateTime pastDateTimeInBerlin = ZonedDateTime.of(pastDateTime, berlinZone);
		
		//What was the time in Denver when at 2022 April 26th 14:30 in Berlin?
		ZonedDateTime pastTimeinDenver = pastDateTimeInBerlin.withZoneSameInstant(denverZone);
		
		System.out.println(pastDateTimeInBerlin);
		System.out.println(pastTimeinDenver);
		
		

	}

}
