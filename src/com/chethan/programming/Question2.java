package com.chethan.programming;

public class Question2 {
	
	
	/*
	 * Given array of n postive integers and a postive integers s,find the minimal length of a contiguous subarray 
	 * of which the sum >= s if  there is not one,return instead.
	 * 
	 * 
	 * Example :
	 * 
	 * Input: s = 7 ,nums = [2,3,1,2,3,4]
	 * 
	 * output :2 
	 * 
	 * Explanation: the subarray [4,3],has the mininmal length under the problem constraint 
	 * 
	 * 
	 * 
	 * 
	 *
	 * 
	 */
	
	
     public static void main(String[] args) {
    	 int[] nums = {2,3,1,2,4,3};
    	 int s = 7;
    	 int result = minSubArrayLen(s,nums);
    	 System.out.println("minSubArrayLen  "+result);
	}
     
     
     public static int minSubArrayLen(int s, int[] nums) {
        
    	 if (nums == null || nums.length == 0) {
             return 0;
         }

         int left = 0;
         int sum = 0;
         int min = Integer.MAX_VALUE;
         
         for (int right = 0; right < nums.length; right++) {
             sum += nums[right];
             while (sum >= s) {
            	 min = Math.min(min, right - left + 1);
                 sum -= nums[left++];
             }
         }

         return min == Integer.MAX_VALUE ? 0 : min;
         
     }

     
    
}
