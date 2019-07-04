package com.chethan.programming;

public class MaximumProductArray {
	
	
	
	public static void main(String[] args) {
		int[] testcase = {2,3,-2,4};
		
		int result = maxProduct(testcase);
		System.out.println("Result  " +result);
		
	}
	
	
	public static int maxProduct(int[] nums){
		int[] max = new int[nums.length];
		int[] min  = new int[nums.length];
		
		max[0]= min[0] = nums[0];
		int result = nums[0];
		
		for(int i=1;i<nums.length;i++){
			
			if(nums[i] > 0){
				
				max[i] = Math.max(nums[i], max[i-1] * nums[i]);
				min[i] = Math.min(nums[i], min[i-1] * nums[i]);
				
			}else{
				max[i] = Math.max(nums[i], min[i-1] * nums[i]);
				min[i] = Math.min(nums[i], max[i-1] * nums[i]);
				
			}
			result = Math.max(result, max[i]);
			
		}
		return result;
		
	}

}
