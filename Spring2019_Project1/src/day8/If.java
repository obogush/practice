package day8;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double iPhone = 599.99;
		double iPad = 899.99;
		int phoneCount, tabletCount;
		double budget;

		System.out.println("Enter your budget: ");
		int buy = input.nextInt();

		System.out.println("What do you want to buy, iPhone or iPad?");
		String buy1 = input.next();

		if (buy < iPad || buy < iPhone) {
			System.out.println("you can buy a device ");
		} else {
			System.out.println("out of budget");
		}

	}
}
