package day11;

import java.util.Scanner;

public class WarmUp1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println(" What is ypur number?");
		int num = in.nextInt();
		if (num % 3 == 0) {

			System.out.println("BUZZ");

		}

		else if (num % 5 == 0) {

			System.out.println("FIZZ");

		}

		else if (num % 3 == 0 && num % 5 == 0) {

			System.out.println("FIZZ BUZZ");

		} else {
			System.out.println("try again!");
		}
	}

}
