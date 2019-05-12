package day10;
import java.util.Scanner;
public class warmUp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long accountNumber = 987654321L;
		String password = "27721";

		System.out.println("Enter your account number:");
		accountNumber = scan.nextLong();
		System.out.println("Enter your password");
		password = scan.next();

		if (accountNumber == 987654321 && password.equals("27721"))
			System.out.println("successful");
		else
			System.out.println(" failed");

	}

}