package application;

import java.time.*;
public class DateTimeOurRegion {

	public static void main(String[] args) {
		
		
		ZoneId myTimeZone = ZoneId.systemDefault();
		ZoneId arizona = ZoneId.of("US/Arizona");
		ZoneId toronto = ZoneId.of("America/Toronto");
		ZoneId vancouver = ZoneId.of("Europe/Madrid");
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		ZonedDateTime currentDateTimeInMyZone = ZonedDateTime.of(currentDateTime, myTimeZone);
		System.out.println(currentDateTimeInMyZone);
	}

}
