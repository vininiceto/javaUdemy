package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula01 {

	public static void main(String[] args) {

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDateTime d01 = LocalDateTime.now();
		LocalDate d02 = LocalDate.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-08-16");

		LocalDateTime d05 = LocalDateTime.parse("2023-08-16T14:20:07");
		Instant d06 = Instant.parse("2023-08-16T01:03:26Z");
		Instant d07 = Instant.parse("2023-08-16T01:03:26-03:00");

		LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 15, 30);

		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("London time: " + d03.toString() + " Brazil time: " + d01.toString());
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);

	}

}
