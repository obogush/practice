package day5;
 import java.util.Scanner; 
public class ScannerIntro {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		
		// ask user questions
		
		System.out.println(" Enter your name please :");
		
		//store user input
		//next()method will read one word
		//String name = userInput. next ();
		// nextline() method will read one whole line
		
		String name = userInput.next();
		
		String sentence  = userInput.nextLine();
		
		// print what user input
		
		System.out.println( " You have entered" + name);
	}

}
