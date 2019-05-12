package day28;

public class TwoDArray3rdWAY {

  public static void main(String[] args) {
    
    //int[] nums = {1,23,4} ; 
    
    int[][] data = { {2,14,3} , {4,5} , {9}  } ; 
    
    for( int[] row : data) {
      
      for( int cell : row) {
        
        System.out.print(cell + " ");
        
      }
      System.out.println();
    }
    
    // data[0][0]= 2 |  data[0][1]= 14 | 
    
    for (int i = 0; i < data.length; i++) {
      
      System.out.print("Row Number " + (i+1) + " : ");
      
      for(int j=0 ; j <  data[i].length ; j++) {
        System.out.print( data[i][j] + " "    );
      }
      
      System.out.println();
      
      
    }
    
    
    
  }
  
}