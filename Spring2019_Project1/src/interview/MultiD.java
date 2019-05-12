package interview;
import java.util.Arrays;

public class MultiD {

	public static void main(String[] args) {
		int arr [] = {1,2};
		
		/*
		 * n dimensional array: contains n-1 dimensional arrays
		 * 
		 * 2D array: contains one dimensional array
		 * 
		 */
		
		int [] arr2D [] = {{1,2},  {3,4}                         };
				//index    	0		1
		//print [1][1]
		System.out.println(arr2D[1][1]);
		
		
		//print {3,4}
		System.out.println(Arrays.toString(arr2D[1]));
		
		//print{1,2}
		System.out.println(Arrays.toString(arr2D[0]));
		
		//entire rows and columns in multi dimensional array
		System.out.println(Arrays.deepToString(arr2D));
		
		
	}

}