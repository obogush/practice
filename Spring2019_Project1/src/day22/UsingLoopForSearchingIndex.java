
   package day22;

public class UsingLoopForSearchingIndex {

  public static void main(String[] args) {
    

String str="ABCAADKAB";
for(int y = 0; y<str.length()-1;y++) {
	System.out.print(str.charAt(y)+"-");	
}
System.out.print(str.charAt(str.length()-1));

}

}