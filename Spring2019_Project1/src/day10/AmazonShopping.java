package day10;
import java.util.Scanner;
public class AmazonShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner scan = new Scanner(System.in);

		    System.out.println("Welcome to Amazon");
		    
		    System.out.println("whats the price in your cart");
		    double price = scan.nextDouble() ; 
		    
		    System.out.println("are you a prime member");
		    boolean isPrimeMember = scan.nextBoolean(); 
		    
		    //if(isPrimeMember==true){
		      
		    if(isPrimeMember){
		      System.out.println("YOU GOT FREE SHIPPING : "+ price);
		    
		    }else if( price> 35){
		      System.out.println("YOU STILL GOT FREE SHIPPING "+ price);
		      
		    }else {                        //bad code
		      System.out.println("YOU gotta pay 5 $ shipping "+ (price +5)) ;
		      System.out.println("you may also consider joining prime to "
		          + "avoid shipping fee");
		      
		    }
		    
		   
		    
		    
		    


		  }

		}

