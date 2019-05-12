package day1;

public class IncremmentandDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// ++var ===> preincrement example int j=++i ==> j is  2 i is 2
		//var++ ===>postincrement example intj = i++ ==> j is 1 i is 2
		// --var ===> predecrement example int j = --i ==> j is O i is 0
		//var-- ==> postdecrement example int j = i-- ==> j is 1 i is 0

		
		int apples = 0;
		System.out.println(apples);
		System.out.println(++apples);
		System.out.println(apples);
		System.out.println(apples++);
		
		apples--;
		
		System.out.println(apples);
		System.out.println(--apples);
		
		int pears = 3;
				//		4 *5/		4	 +    2 ====> 7
		int basket = ++pears*5 / pears-- + --pears;
		
		
		System.out.println(basket);
		System.out.println(pears);
		
	}
	
}
