package day24;

public class ArrayTasks {

  public static void main(String[] args) {
    
    // create an char array that contains your name characters
    // create 3 array using the 3 different ways that you learned 
    
    // print out each items of your nameArray 
    
    char[] myNameChar = new char[6];
    myNameChar[0] = 'M';
    myNameChar[1] = 'E';
    myNameChar[2] = 'H';
    myNameChar[3] = 'M';
    myNameChar[4] = 'E';
    myNameChar[5] = 'T';
    
     System.out.print( myNameChar[0] );
     System.out.print( myNameChar[1]);
     System.out.print( myNameChar[2]);
     System.out.print( myNameChar[3]);
     System.out.print( myNameChar[4]);
     System.out.print( myNameChar[5]) ; 
     
     System.out.println( );
     for (int i = 0; i < 6; i++) {
    System.out.print( myNameChar[i]  );
     }
     System.out.println( );
     
     char[] myNameChar2 = new char[] {'G', 'u', 'l','j','a','h','a','n'} ; 
     
     for (int i = 0; i < myNameChar2.length ; i++) {
     System.out.print( myNameChar2[i] + " " );
     }
    
    
    
    
    
    

  }

}
