package allRepl;
import java.util.Scanner;
public class SeksenDokuz {
	
	 public static void main(String[] args) {
	
	boolean exists = false;
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
      int counter =0;
    int javaCount =0;
    if(word.length()<=1) {
    	System.out.println("false");
    	System.exit(0);
    }
    
    if (word.substring(counter, counter + 4).equals("java"))counter++; {
    	javaCount++;

    }

    
     if (javaCount>=1) {
    	System.out.println("true");}
    	
     else if(javaCount<=0) {
    	 System.out.println("false");
     }else {
    	 System.out.println("false");
     }
    
  }
}