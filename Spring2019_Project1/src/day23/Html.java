package day23;

import java.util.Scanner;

public class Html {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String html = scan.nextLine();
    
   	for (int i = 0; i < 2; i++)
			;
		{

			if (html.contains("linkid")) {
				System.out.println("linkid");
			}else if (html.contains("fb")) {
				System.out.println("fb");
			}
			
			else if (html.contains("html")) {
				System.out.println("mynewid");
			}

			else {
				System.out.println("Invalid input!");
			}
		}

	}
}