package day21;
import java.util.*;
public class TaskWarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two number:");
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int sum=x1+x2;
		while(sum<100) {
			System.out.println("Please enter two number:");
			int x=scan.nextInt();
			sum=sum+x;
		}
			System.out.println(sum);
			
		}
	}
	
