package day24;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an int array of 5 items and assign values ; 

		// double the value of 3rd item  : for example 9 --> 18 
		// update the value of 4th item to sum of 1st and 2nd items

		// print them out using the loop 

		// OPTIONALLY SWAP the value of first and last items --->{9,......,1}
		
		//get the sum of all numbers
		
		// create an int array of 5 items and assign values ; 
	    //{1,4,6,8,9}
	    int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    System.out.println();
	    // double the value of 3rd item  : for example 6 --> 12 
	    nums[2] = nums[2] * 2 ; 
	    // update the value of 4th item to sum of 1st and 2nd items  8 --> 1+4
	    nums[3] = nums[0] + nums[1] ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    
	    
	    
	    
	    
	    

	  }

	}
