package application;
import java.time.*;

public class InstantAndDuration {

	public static void main(String[] args) {
		
		//Getting the current timestamp
		Instant timestamp = Instant.now();
		System.out.println("Timestamp: " + timestamp);
		
		//Get the nan seconds from the last second
		int nanoSecondFromLastSecont = timestamp.getNano();
		System.out.println(nanoSecondFromLastSecont);
		
		//Set the duration to three hours
		Duration threeHours = Duration.ofHours(3);
		
		//Substract 15 minutes from 3 hours and get the remaining as seconds
		long seconds = threeHours.minusMinutes(15).getSeconds();
		
		//Converting the remaining of seconds to minutes
		long minutes = Duration.ofSeconds(seconds).toMinutes();
		
		System.out.println("3 hours - 15 minutes = " + seconds + " seconds.");
		System.out.println("3 houes - 15 minutes = " + minutes + " minutes.");
		
	}

}
