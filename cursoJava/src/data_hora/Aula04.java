package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aula04 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d02.minusHours(5);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(1, ChronoUnit.HOURS);
		
		Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(fmt01.format(pastWeekLocalDate));
		System.out.println(fmt01.format(nextWeekLocalDate));
		System.out.println(fmt02.format(pastWeekLocalDateTime));
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		
	}

}
