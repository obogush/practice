package day18;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
				Scanner scan = new Scanner(System.in);
				
				int x =1;
				//int y= 10;
				
				while(x!=5 && x!=10) {
					
					System.out.println("Give me five or ten dollars!");
					x=scan.nextInt();
				}
				
				System.out.println("You are awesome ");

			}

		}