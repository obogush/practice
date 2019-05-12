package day18;
import java.util.Scanner;
public class WhileloopMultipleConditination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    
	    
	    // create a dynamic counter program 
	    // ask user a number 
	    
	    // if user enter 5  ---->>> 1 2 3 4 5
	    // if user enter 7  ---->>> 1 2 3 4 5 6 7 
		
		// Scanner scan = new Scanner(System.in) ;
		 
		 
		 Scanner input = new Scanner(System.in);
			System.out.println("Enter x number");
			int number = input.nextInt();
			int x = 1;
			while(x <= number) {
				System.out.print(x++ + " ");
				//x++;
			}
	}
}



