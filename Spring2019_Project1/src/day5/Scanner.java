package day5;


 import java.io.InputStream;

 public class Scanner {

	
	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		double fahrenheit = 80;
		double celcius =(5/9d)*(fahrenheit -32);
	    
	    Scanner keyboard = new Scanner(System.in);
	    int a;
		        
	    System.out.println("Add the fahrenheit value for conversion: \n");
	    int userInput = keyboard.nextInt();
	    System.out.println(a =(int) ((5/9d)*(userInput -32)));
}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
} 