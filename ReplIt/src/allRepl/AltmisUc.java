package allRepl;

import java.util.*;

public class AltmisUc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//You have a word, do the following:
			//If the word has odd number of characters
			//and has 5 or more characters, print the middle three 
			//characters of the word. 
			//Otherwise print "invalid".
			//fifteen ==> fte
			//apple ==> ppl
			//hey ==> invalid
			//java ==> invalid
			//whatsup ==> ats
			//$ ==> invalid
		
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    
		    
			 int a = word.length();
			 String result = ((a>=5) && (a %2 !=0))?
			 word.substring((a/2)-1 , (a/2)+2) : "invalid";
			 System.out.println(result);
			 
		  }
		}
		