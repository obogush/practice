
public class wormUp {
	

		public static void main(String[] args) {
			
			// declare variables that can hold the unit price of each vegetables 
			// assign value according to the picture you saw on the screen 
			// Then print out below message by concatenating the final price of each 
			/*
			 * Expected Result ;
				1 Cucumber is 2.5 dollars
				4 Tomatoes are 12 dollars
				2 Onion is 3 dollars
				1 Pepper is 2 dollars
				6 Carrot is 24 dollars
			 * */
			//double cucumber1 = 2.5d;
			float cucumber = 2.5f ; 
			int tomatoes = 3;
			double onion = 1.5;
			int pepper = 2;
			int carrot = 4;
			
			
			System.out.println("1 Cucumber is " + cucumber +"$");
			
			System.out.println("4 Tomatoes are " + tomatoes*4  +"$");
			
			System.out.println("2 Onion is " + onion * 2 + "$");
			
			System.out.println("1 Pepper is " + pepper + "$");
			
			System.out.println("6 Carrot is " + carrot * 6 + "$");
			
			
			double total = cucumber + tomatoes*4 + onion*2 + pepper*2 + carrot *6; 
			System.out.println("total price= "+total + " dollars");

		}

	}

