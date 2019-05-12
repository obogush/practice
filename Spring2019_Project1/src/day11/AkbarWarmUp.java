package day11;
import java.util.Scanner;
public class AkbarWarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    // THIS MUST BE THE FIRST condition 
		    if (num % 5 == 0 && num % 3 == 0)
		      System.out.println("fizz buzz");
		    else if (num % 5 == 0)
		      System.out.println("fizz");
		    else if (num % 3 == 0)
		      System.out.println("buzz");
		    else
		      System.out.println("NOT A FIZZ BUZZ NUMBER");

		  }

		}

	
