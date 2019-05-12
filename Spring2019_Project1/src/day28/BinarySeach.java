package day28;

import java.util.Arrays;

public class BinarySeach {

  public static void main(String[] args) {
    // 
    int[] nums =  {4, 5, 6, 11, 19, 20, 54} ; 
    
    Arrays.sort(nums);
    System.out.println( Arrays.toString(nums) );
    // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
    
    int index = Arrays.binarySearch(nums, 5) ;
    System.out.println(index);
    
    int idx20 = Arrays.binarySearch(nums, 20) ;
    System.out.println(idx20);
    
    // IF WE DONT HAVE THE ITEM IN THE ARRAY 
    // We will get minues number to point the insertion point of the array 
    // to keep this array sorted 
    
    //  {4, 5, 6, 11, 19, 20, 54} ; 
    ////////////////////////////////  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
    //  {4, 5, 6, 11, 19, 20, 54 , 100} ; 
    
    int idx10 = Arrays.binarySearch(nums, 10) ;
    System.out.println(idx10);
    
    int idx100 = Arrays.binarySearch(nums, 100) ;
    System.out.println(idx100);
    
  //  {4, 5, 6, 11, 19, 20, 54} ; 
    int idx3 = Arrays.binarySearch(nums, 3) ;
    System.out.println(idx3);
    
    
    int[] nums100 = new int[100] ; 
    Arrays.fill(nums100, 5);
    System.out.println(Arrays.toString(nums100));
    
  //  {4, 5, 6, 11, 19, 20, 54} ; 
    
  //  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
    
    
    int [][] data = new int [4] [2];
	data [0] [0] = 12;
	data [0] [1] = 17;
	data [1] [0] = 3;
	data [1] [1] = 40;
	data [2] [0] = 44;
	data [2] [1] = 27;
	data [3] [0] = 23;
	data [3] [1] = 12;
	
    
    
    
    
    
    
    
    

  }

}
