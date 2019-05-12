
package day20;
import java.util.*;
public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scan = new Scanner(System.in);
System.out.println("Please Enter the name");
int i=0;
String name = scan.next();

do {
	
	System.out.print(name.charAt(i)+" ");
	i++;
}while (i<name.length());
	}
}
