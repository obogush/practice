
	
	

package day10;
import java.util.Scanner;
  public class Amazon {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);

		    System.out.println("Welcome to Amazon Shopper ");
		    
			System.out.println( "Please enter the price:");
			double price = scan.nextDouble();
			System.out.println("Do you have a prime member?");
			boolean primeMember = scan.nextBoolean();
			
			if (true) {
				System.out.println("free shipping");
			} else if (price> 35) {
				System.out.println("free shipping");
			}else {
				System.out.println("Shipping price " + price+5);
		}
			
		}
	}



