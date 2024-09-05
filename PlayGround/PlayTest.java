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
		LinkedList<Integer> ll = new LinkedList<>();
		Queue<Object> q = new LinkedList<>();
		

        int[]a = {1, 2, 4, 5, 6};
		q.add(4);
		q.add(2);
        System.out.println(q);
	}

}