package day16;
import java.util.Scanner;
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		  
		    int a = word.length();
		    
		    int b = a-1;
		    
		    char c = word.charAt(b);
		    System.out.println("last char: "+c);
		    
		    System.out.println("location 2 to 4:  "+word.substring(2,4));
		    System.out.println(" "+ word.charAt(0)+word.charAt(1));
		    
		
	}

}
