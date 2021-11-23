package main;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AngleBetweenHourAndMinuteHand {

	public static void main(String[] args) throws ParseException {

		LocalTime localTime = LocalTime.parse("11:55", DateTimeFormatter.ofPattern("HH:mm"));
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		System.out.println(angleClock(hour, minute));
		
		System.err.println();

	}

	public static double angleClock(int hour, int minutes) {

		double angleHourHand = (hour * 30) % 360 + minutes * 0.5;

		double angleMinuteHand = minutes * 6;

		double difference = angleHourHand - angleMinuteHand;

		if (difference < 0) {
			difference *= -1;
		}

		if (difference > 180) {
			difference = 360 - difference; // the other angles that completes to 360
		}

		return difference;
	}
}
