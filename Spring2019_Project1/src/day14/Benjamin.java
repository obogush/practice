package day14;
import java.util.*;
public class Benjamin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

				Scanner in = new Scanner(System.in);
				System.out.println("Split: ");
				boolean split = in.nextBoolean();
				
				System.out.println("Enter number of people");
				int numOfPeople = in.nextInt();
				System.out.println("Number of people entered: "+numOfPeople);
				
				
				System.out.println("Check amount:");
				int totalCost = in.nextInt();
				
				
				System.out.println("Enter service quality");
				int a = in.nextInt();

				
				String b;
				switch (a) {

				case 1:
					b = "Poor";
					break;
				case 2:
					b = "Fair";
					break;
				case 3:
					b = "Good";
					break;
				case 4:
					b = "Great";
					break;
				case 5:
					b = "Excellent";
					break;
				default:
					b = "bad selection";
				}
				System.out.println(a);

				

				

				if (a == 1) {
					System.out.println("Total to pay: " + (totalCost + ((totalCost * 5) / 100)));
				} else if (a == 2) {
					System.out.println("Total to pay: " + (totalCost + ((totalCost * 10) / 100)));
				} else if (a == 3) {
					System.out.println("Total to pay: " + (totalCost + ((totalCost * 15) / 100)));
				} else if (a == 4) {
					System.out.println("Total to pay: " + (totalCost + ((totalCost * 20) / 100)));
				} else if (a == 5) {
					System.out.println("Total to pay: " + (totalCost + ((totalCost * 25) / 100)));
				}

				int totalPerPerson = totalCost / numOfPeople;

				System.out.println("Total per person: " + totalPerPerson);

				int TipPer;
				if (split == true & a == 1) {
					TipPer = ((totalCost + ((totalCost * 5) / 100)) / numOfPeople);
					System.out.println("Tip per person: " + TipPer);
				} else if (split == true & a == 2) {
					TipPer = ((totalCost + ((totalCost * 10) / 100)) / numOfPeople);
					System.out.println("Tip per person: " + TipPer);
				} else if (split == true & a == 3) {
					TipPer = ((totalCost + ((totalCost * 15) / 100)) / numOfPeople);
					System.out.println("Tip per person: " + TipPer);
				} else if (split == true & a == 4) {
					TipPer = ((totalCost + ((totalCost * 20) / 100)) / numOfPeople);
					System.out.println("Tip per person: " + TipPer);
				} else if (split == true & a == 5) {
					TipPer = ((totalCost + ((totalCost * 25) / 100)) / numOfPeople);
					System.out.println("Tip per person: " + TipPer);
				}

			}
		}
		



