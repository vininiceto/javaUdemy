package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula02 {

	public static void main(String[] args) {
		
		Instant d07 = Instant.now();

		LocalDate d04 = LocalDate.parse("2023-08-15");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-15T16:44");
		Instant d06 = Instant.parse("2023-08-15T19:52:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt2));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d07 = " + fmt3.format(d07));
		
		
	}

}
