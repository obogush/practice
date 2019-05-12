package day8;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//comparison reminder: equality ==
				//inequality !=
				//greater than or equal >=
				//greater than >
				//less than <
				//less than or equal <=
				
			//result of comparison operator is boolean; true or false
		
		
		//logical operators
		
		int a = 10,  b = 20, c =10;
		
		boolean b1 = a > b;
		boolean b2 = a >=c ;
		
		System.out.println(" a is more than b " + b1);
		System.out.println("a is more than or equal to c " + b2);
	
		
		boolean bothMeetRequirement = b1 && b2;
		System.out.println("are both conditions are met = "+ bothMeetRequirement);
	}

}
