package allRepl;
import java.util.Scanner;
public class AlmisDort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that will swap first and last characters in the string. 
		//Use substring method to slice the string. Print out result into the console. 

		//Example #1
		//input: apple
		//output: eppla
		//Example #2
		//input: pursuit
		//output: tursuip
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
		int a = word.length();
		int lastCar= a-1; // last index number
		
		char FirstLetter = word.charAt(0); // first character 0
		
		char LastLetter = word.charAt(a-1);
		
		String Concat = LastLetter+word.substring(1,lastCar)+FirstLetter;
		
		System.out.println(Concat);
	}

}
