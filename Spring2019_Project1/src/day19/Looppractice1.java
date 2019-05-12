package day19;

import java.util.Scanner;

public class Looppractice1 {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("ENTER A name");
    // Ask user a name 
    // for example  Bilal ----> B-i-l-a-l-
    String name = scan.nextLine() ;
    
    int x = 0 ; 
    while(x< name.length() ) {
      
      System.out.print (  name.charAt(x)  + "-");
      ++x ;   //x++ ; 
    }
    
    
    
    
    
    
    //System.out.println();
//    System.out.print(name.charAt(0)+"-");
//    System.out.print(name.charAt(1)+"-");
//    System.out.print(name.charAt(2)+"-");
//    System.out.print(name.charAt(3)+"-");
//    System.out.print(name.charAt(4)+"-");
    
    
    
    

  }

}
