package day34;

import java.util.Scanner;

public class TimesUp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minutes for countdown: ");
		int minutes=scan.nextInt();
		
		for (int i=minutes ; 0<i ; i--) {
			for (int z=60; z>0;z--) {
				
		System.out.println( (i-1)+" minutes and "+z+" seconds left");
				
					try {Thread.sleep(1000);}catch (Exception e) {} 
				}
			}

			System.out.println("TIME'S UP!!");
	}
}



