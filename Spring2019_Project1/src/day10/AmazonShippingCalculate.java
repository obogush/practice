package day10;
import java.util.Scanner;
public class AmazonShippingCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner day10 = new Scanner(System.in);
		
		
		System.out.println("Welcome Amazon Shopper");
		
		System.out.println("Enter Your E-mail");
		String email=day10.next();
		System.out.println("Please Enter Your Password: ");
		
		String password=day10.next();
		 
		
		
		
		//list of prime member
		boolean PM1=email.equals("info@xyz1.com");
		boolean PM2=email.equals("info@xyz2.com");
		boolean PP1=password.equals("123456");
		boolean PP2=password.equals("123457");
		
		
		boolean PM3=email.equals("info@xyz3.com");
		boolean PM4=email.equals("info@xyz4.com");
		boolean PP3=password.equals("123458");
		boolean PP4=password.equals("123459");
		
		
		
		if ( PM1 || PM2 && PP1||PP2) {
			System.out.println("Enter Your cart Price");
			double price=day10.nextDouble();
			System.out.println("Your cart is: $"+price+ "\n"+"shipping is Free"+"\n"+"Total is: $"+price);
		}else if(PM3 || PM4 && PP3||PP4){
			System.out.println("Enter Your cart Price");
			double price=day10.nextDouble();
			System.out.println("Your cart is: $"+price+ "\n"+"shipping is $5"+"\n"+"Total is: $"+(price+5));
		}
	}
}

