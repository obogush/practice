package interview;

public class Binyamin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 10;

		System.out.println("num1 " + num1 + " " + "num2 " + num2);
		num1 = num1 + num2; // first add two numbers assigned to num1
		num2 = num1 - num2; // subtract num2 from num1 assigned to num2
		num1 = num1 - num2; // subtract num2 from num1 assigned to num1
		/*
		 * 
		 * num1=15 15-10=5 num2 15-5=10 num1
		 * 
		 * 
		 */

		System.out.println("num1 " + num1 + " " + "num2 " + num2);

	}

}


