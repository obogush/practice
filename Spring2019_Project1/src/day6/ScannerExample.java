package day6;


import java.util.Scanner;

public class ScannerExample {
 
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name today : ");
		String name = input.next();
		System.out.println("Enter your age today : ");
		 int age = input.nextInt(); 
		System.out.println( " Enter your birth day : ");
	   
		
		int birthYear = input.nextInt();
		int birthDay = 2019;
		
	    
	    System.out.println("Your name is : " + name );
	    System.out.println("Your age is : " + age );
	    System.out.println( " Your birth day is: " +  (2019-birthYear) );
	}

}
