package day12;
import java.util.Scanner;
public class WarmUp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		String weather = "cold";
		String action = "Have a fun";

		
		System.out.println("What is the weather?");
		action=input.next();
		
		action = weather.equals("sunny") ? "Good day it is, go out and have fun" : "Stay home and do some code!";

		System.out.println(action);
	}

}

