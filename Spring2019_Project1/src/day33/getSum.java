package day33;

public class getSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { 1, 2, 3, 4, 5 };

		int sum = getSum(nums);

	}

	public static int getSum(int[] arry) {
		int sum = 0;

		for (int i = 0; i < arry.length + 1; i++) {
			sum = sum + i;

		}
		System.out.println("Total value " + sum);

		return sum;

	}

}
