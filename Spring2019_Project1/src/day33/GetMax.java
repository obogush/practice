package day33;

public class GetMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		
		int max = getMax(nums);

	}
		public static int getMax(int[]nums) {
	int max = nums [0];
	
	for(int i = 1 ; i<nums.length; i++) {
		if (max<nums[i]) {
			max=nums[i];
			
			
		}
		
		
	
	}
	System.out.println("max value  " + max);
	return max;
}
}
