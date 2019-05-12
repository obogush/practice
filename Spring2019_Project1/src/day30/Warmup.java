package day30;

public class Warmup {

	// TODO Auto-generated method stub

//		Create few static methods with no return type with below name and logic
//
//				1, create a method called countFrom1To10
//				take no parameters 
//				print 1-10 in one line with space
//
//				2, create a method called countFrom1ToN
//				take 1 int as parameter  
//				print 1-N(number user passed) in one line with space
//
//				3, create a method called CountDown
//				take 1 int as parameter 
//				and count down till 1 in method body

	public static void main(String[] args) {

		countFrom1To10();
		countDown(10);
	}

	public static void countFrom1To10() {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
     System.out.println();

	}

	public static void countDown(int l) {

		for (int i = l; i > 0; i--)
			System.out.print(i + " ");
	}

}
