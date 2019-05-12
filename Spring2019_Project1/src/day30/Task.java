package day30;

public class Task {

	public static void main(String[] args) {
	    
	    reportName("Ozlem" , "Bunyamin");
	}

	public static void reportName(String firstName, String firstNAme2) {

	    System.out.println("Length of Firstname is: " + firstName.length() + "Length of Firstname2 is: " +firstNAme2);
	    System.out.println("Initials of Names: " + firstName.charAt(0) + firstNAme2.charAt(0));
	    
	}
}