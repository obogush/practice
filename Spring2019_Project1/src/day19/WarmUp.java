package day19;
		import java.util.Scanner;
		public class WarmUp {

			public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter a sentence!");
				String word = input.next();
				
				int i =0;
				
				while((!word.contains("java") )) {
					
					 System.out.println("Enter a new sentence" );
					 word = input.nextLine();
					
					
				}
				
					System.out.println("Today a Java day!");

			}

		}
		
		