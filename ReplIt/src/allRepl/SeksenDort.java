package allRepl;
import java.util.Scanner;
public class SeksenDort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();

		long x = 1;
		

		do {
			x = x * n;
			n--;
		} while (n > 1);

		System.out.println(x);

	}
}
		

		