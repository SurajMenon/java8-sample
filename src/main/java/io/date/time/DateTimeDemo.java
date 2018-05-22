package io.date.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo {

	public static void main(String args[]) {
		
		//1. LocalDateTime class
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Local Date Time: " + dt.toString());

		//Since LocalDateTime is immutable new var created
		ZoneId australia = ZoneId.of("Australia/Sydney");
		ZonedDateTime dt2 = dt.atZone(australia);
		System.out.println("Local Date Time of Australia: " + dt2.toString());

		
		//2. LocalDate class
		LocalDate ld = LocalDate.now();
		System.out.println("\nLocal Date: " + ld.toString());
		System.out.println("Month: " + ld.getMonth());
		
		
		//3. LocalTime class
		LocalTime lt = LocalTime.now();
		System.out.println("\nLocal Time: " + lt.toString());
		System.out.println("Hour: " + lt.getHour());
		
		//4. Instant class
		Instant i = Instant.now();
		System.out.println("\nUTC Time  : "+i);
		System.out.println("System Milli: "+i.getEpochSecond());
		
		
		//5. Duration class
		Duration d = Duration.between(lt, LocalTime.now());
		System.out.println(d);
	}

}
