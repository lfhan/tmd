package tmd;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocateDateTest {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate date = LocalDate.now();
		LocalDate plusDays = date.plusDays(20);
		System.out.println("当前日期="+date);
		System.out.println("当前日期加20天的后="+plusDays);
		int dayOfMonth = date.getDayOfMonth();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfYear = date.getDayOfYear();
		System.out.printf("dayOfMonth=%d dayOfYear=%d",dayOfMonth,dayOfYear);
		String lineSeparator = System.lineSeparator();
		System.out.println(lineSeparator);
		System.out.println(dayOfWeek.getValue());
	}
}
