package day19;
import java.util.Scanner;

public class Midilli {

	public static void main(String[] args) {
		// how to check whether string start with a-z
		
		 
			    Scanner scan = new Scanner(System.in);

			    String str = scan.next();
			    
			    char firstChar = str.charAt(0);
			    char lastChar = str.charAt(str.length()-1);

			 
			    

			    if (firstChar >= '1' && firstChar <= '9') {

			      System.out.println(str +" starts with a number");

			    }
			    
			    if (lastChar >= 'A'&& lastChar <= 'Z') {
			    	
			    	System.out.println( str +" ends with an uppercase letter");
			    }else {
			    	System.out.println(str +" does not end with an uppercase letter");
			    }
			    
			  
			  }

			}
