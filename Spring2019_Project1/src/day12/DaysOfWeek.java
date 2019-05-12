package day12;

import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {

		int day;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number 1 -7 ");
		day = scan.nextInt();
		String DaysInWeek;

		switch (day) {
		case 1:
			DaysInWeek = "Sunday";
			break;
		case 2:
			DaysInWeek = "Monday";
			break;
		case 3:
			DaysInWeek = "Tuesday";
			break;
		case 4:
			DaysInWeek = "Wednesday";
			break;
		case 5:
			DaysInWeek = "Thursday";
			break;
		case 6:
			DaysInWeek = "Friday";
			break;
		case 7:
			DaysInWeek = "Saturday";
			break;
		default:
			DaysInWeek = "Invalid Entry, try again!";
			break;

		}
		System.out.println("The day is a: " + DaysInWeek);
	}
}

