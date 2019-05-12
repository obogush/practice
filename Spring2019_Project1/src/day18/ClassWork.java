package day18;
import java.util.Scanner;
public class ClassWork
{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scan.nextLine();
		
		boolean NameStartsWith =name.startsWith("A");
		boolean NameEndsWith =name.endsWith("x");
		
		
		System.out.println(NameStartsWith);
		System.out.println(NameEndsWith);
		
		int index1 = name.lastIndexOf("a");
		System.out.println(index1);
		
	}

}