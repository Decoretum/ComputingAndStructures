import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
// import java.time.temporal.ChronoUnit;

public class PlayTest {


	public static void main (String args[])
	{
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String temp = "2024-06-25";
		LocalDate dateRented = LocalDate.parse(temp, formatter);
		Long duration = now.until(dateRented, ChronoUnit.DAYS);
		System.out.println(2 & 13);
	}

}