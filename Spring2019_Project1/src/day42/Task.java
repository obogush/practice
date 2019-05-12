package day42;
import java.util.ArrayList;
import java.util.Collections;
public class Task {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TASK 1 
		//Create an ArrayList object and add 5 whole numbers
		//try out adding one by one 
		//and also try adding in one shot 
		//update each number to doule of that number  1,3,5,6,7 --> 2 6 10 12 14
		// reverse this ArrayList using one of the utility method that we learned from Collections class

		//OPTIONALLY Reverse this ArrayList not using above method 
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);

		for (int i=0; i<list.size();i++) {
			
			list.set(i, list.get(i)*2);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}
}