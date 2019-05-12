package day15;
import java.util.Scanner;
public class Homework {




	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number 1-12 to identify seasons:");
		int MonthNumber = in.nextInt();
		String seasons;
		switch (MonthNumber) {

		case 1:
			
		case 2:
			
		case 12:
			seasons = "Winter";
			break;
		case 3:
			
		case 4:
			
		case 5:
			seasons = "Spring";
			break;
		case 6:
			
		case 7:
			
		case 8:
			seasons = "Summer";
			break;
		case 9:
			
		case 10:
			
		case 11:
			seasons = "Fall";
			break;
		default:
			seasons = "invalid selection";

		}

		System.out.println("It's " + seasons);

	}

}
