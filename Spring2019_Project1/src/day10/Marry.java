package day10;
import java.util.Scanner;
public class Marry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
	    
	    System.out.println("Will you marry me ");
	    String yesNoAnswer = scan.next() ; 
	  
	    if(yesNoAnswer.equalsIgnoreCase("yes")){
	      
	      System.out.println("She said yes");
	      
	     
	    }else{
	      System.out.println("She said nO");
	    }
	    
	  
	}

}




