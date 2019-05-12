package day6;
import java.util.Scanner;
public class BirthDate {

	public static void main(String[] args) {
		
		    
		        Scanner input = new Scanner (System.in);
		        
		        System.out.println(" What is your birth date: ");
		        int birthYear = input.nextInt();
		        int age = 2019 - birthYear;
		        
		        System.out.println("Your age is " + age);
		    }

		}


