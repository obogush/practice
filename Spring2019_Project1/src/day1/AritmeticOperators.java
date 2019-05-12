package day1;

public class AritmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1 =20;
       int n2 = 10;
       
       int sum = n1+n2;
       int substraction = n1-n2;
       int division = n1/n2;
       int multiplication = n1*n2;
       int remainder = n1%n2;
       
       System.out.println(sum+" "+substraction+" "+division+" "+multiplication+" "+remainder);
       
       int num1 = 5+3*2 % 2;
   //    
      System.out.println(num1);
      
      num1 = (4+3)*2;
      System.out.println(num1); 
      
     num1 = ( 4+3) * 2+4 /2;
     System.out.println(num1);
      
      // Operator= multiplication / Division/ Modules ( *, / ,% )
     
      // Symbols = addition/Subtraction (+, - )
     
     byte b = 10;
     short sh = 20;
     //short total = b+sh; will not compile
     
     int total = b+sh;
     System.out.println(total);
     
     sh= 100+2;
     
     double d = 10.5;
     int i = 4;
     double j = d*i;
     System.out.println(j);
     double d2 = 3.4;
     double d3= d-d2;
     System.out.println(d3);
     
	}

}
