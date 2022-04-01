package java8Streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimePractice {
	
public static void main(String[] args) {
	//one of the java8 features Date API
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);
}
}
