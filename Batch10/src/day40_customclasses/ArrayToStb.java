package day40_customclasses;

import java.util.Arrays;

public class ArrayToStb {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String[] words = new String[5];
			words[0] = "coffee"	;
			words[1]= "tea";
			words[2]= "water";
			words[3]="juice";
			words[4]= "milk";
			
		System.out.println(Arrays.deepToString(words));
	//Create StringBuilder object
			
		StringBuilder wordsStb = new StringBuilder();
			
	// Without loop if you have fixed number of values in String[]
			
	   wordsStb.append(words[0])
			   .append(words[1])
			   .append(words[2])
			   .append(words[3])
			   .append(words[4]);
	
	 System.out.println(wordsStb);
	//add everything into stringBuilder using a loop
	 
	 StringBuilder wordsBuilder = new StringBuilder();
	 for(String drink : words) {
		 
		 wordsBuilder.append(drink);
	 }
	
	System.out.println(wordsBuilder);
	
	}
	
}
