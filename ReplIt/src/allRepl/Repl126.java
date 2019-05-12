package allRepl;

import java.util.*;

public class Repl126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		                    
		                    
		                  int min = str[0].length();
				int index=0;
				for (int i = 0; i < str.length; i++) {
					if (str[i].length() < min) {
						min = str[i].length();
						index=i;
					}
				}
				System.out.println(str[index]);  
		                    
		                    
		                    
		  }
		}
	
