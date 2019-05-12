package day27;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		 String[] str1 = str.split(" ");
		 char[] sentenceChars = str.toCharArray(); 
		 String school = " ";
			    

		 for(int x =0 ; x<str1.length; x++) {
			    
			    for (int y = str1[x].length()-1; y >=0; y--) {
			    	school =school + str1[x].charAt(y);
}
			   school += " ";
		 }  
		 System.out.print(school);	    
	}
	}
	
