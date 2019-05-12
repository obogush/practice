package day33;

import java.util.Arrays;

public class CombineArray {

	public static void main(String[] args) {

int num1 []= {1,3,5};
int num2 []= {2,4,6};

int size =  (num1.length + num2.length);

int [] combined= new int[size];
for (int i = 0; i<num1.length; i++) {
	
	combined[i]=num1[i];
	
}
for(int j= 0; j<num2.length; j++) {
	
	
	combined[num2.length+j]= num2[j];
	
}
System.out.println(Arrays.toString(combined));
	}

}
