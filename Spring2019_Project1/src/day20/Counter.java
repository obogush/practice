package day20;

public class Counter {

  public static void main(String[] args) {

    // how many letter a showed up in this String
    String str = "Bunyamin Bogus";
    
    // go through each and every character
    // if i see a , i will increment my counter by 1
    
    int count= 0 ; 
    int x = 0;  
        
    do {
      
      char c = str.charAt(x) ; 
      if(c=='u' || c=='U') {
        System.out.println("BINGO at " + x);
        ++count ; //count = count + 1;  
      }
      //System.out.println(  + " ");
      x++ ; 
      
    }while(x<str.length());
    
    System.out.println( count  );

  }

}
   //*   String word = scan.next();

    //int x = 0;
     //int sumA = 0;

     //while(x<word.length()) {

	//char a = word.toLowerCase().charAt(x++);
	//if(a=='a')
	//sumA++;
   // }

    //System.out.println(sumA);

