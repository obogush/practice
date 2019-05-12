package day21;
import java.util.*;
public class Bilmemki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
				Scanner scan=new Scanner(System.in);
				System.out.println("Put your name");
				String name=scan.next();
				int len=name.length();
		//print each char in name		
				for (int i = 0; i < name.length(); i++) {
					System.out.println(name.charAt(i));
				}
		//reverse the name	
				String reverse="";
				for (int i = len-1; i>=0; i--) {
					reverse+=name.charAt(i);
				}
				System.out.println("Reversed with for: "+reverse);
				
		//print each char in name with while
				int i=0;
				while(i<=len-1) {
					System.out.println(name.charAt(i));
					i++;
					}
		//reverse the name	with while
				String reverseW="";
				int len2=name.length();
				while(len2-1>=0) {
					reverseW+=name.charAt(len2-1);
					len2--;
				}
				System.out.println("Reversed with while: "+reverseW);
			}

		
	}

		