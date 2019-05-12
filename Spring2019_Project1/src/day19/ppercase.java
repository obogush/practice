package day19;
		import java.util.Scanner;
		public class ppercase {

			public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter a sentence!");
				String word = input.nextLine();
				
				System.out.println(word);
				
				String result = word.toUpperCase();
				System.out.println(result);
			}
		}