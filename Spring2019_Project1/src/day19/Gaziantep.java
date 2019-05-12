package day19;
import java.util.Scanner;
public class Gaziantep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		      int length = word.length();
		    
		    String reverse = (length==5) ? word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+
		    							  word.charAt(1)+""+word.charAt(0)+"": 
		    							  length >5 ? "Too long!":   length<5 ? "Too short!": "";
		    							  
		    							  System.out.println(reverse);
		    
	}

}
