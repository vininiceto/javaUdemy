package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula03 {

	public static void main(String[] args) {

		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 + " + r1);
		System.out.println("r2 + " + r2);
		System.out.println("r3 + " + r3);
		System.out.println("r4 + " + r4);
	
		
		
		
		
	}

}
