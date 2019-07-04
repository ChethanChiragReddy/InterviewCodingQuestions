package com.chethan.programming;

import java.util.Arrays;

public class Question3 {
	
	
	/*
	 * Find the kth largest element in an unsorted array 
	 * Note that it is the kth largest element in the sorted order,
	 * not the kth distinct element.
	 * 
	 * 
	 * For example ,given [3,2,1,5,6,4] and k = 2 
	 * 
	 *  return 5 
	 * 
	 */	
	
	public static void main(String[] args) {
		int[] testcase = {3,2,1,5,6,4};
		int K = 2;
		
		
	   int result1  = findKthLargestSolution1(testcase, K);
	   System.out.println("Result Solution1 " +result1);
	   
	   int result2 = findKthLargestSolution2(testcase, K);
	   System.out.println("Result Solution2 " +result2);
	}
	
	
	// Solution 1
	public static int findKthLargestSolution1(int[] nums,int K){
		Arrays.sort(nums);
		return nums[nums.length- K];
	}
	
	
	// Solution 2 (Quick sort)
	public static int findKthLargestSolution2(int[] nums, int K){
		if(K < 1 || nums == null ){
			return 0;
		}
		return getKth(nums.length -K +1, nums, 0, nums.length -1);
	}
	
	
	public static int getKth(int K,int[] nums,int start,int end){
		int pivot = nums[end];
		
		int left = start;
		int right  = end;
		
		while(true){
			
			while(nums[left] <pivot && left < right){
				left++;
			}
			
			while(nums[right] >= pivot && right > left ){
				right++;
			}
			
			if(left == right){
				break;
			}
			
			swap(nums,left,right);
		}	
		
		swap(nums,left,end);
		
			if(K == left +1){
				return pivot;
			}else if(K < left +1){
				return getKth(K, nums, start, left -1);
			}else{
				return getKth(K, nums, left+1, start);
			}
		
}		


	private static void swap(int[] nums, int n1, int n2) {
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
		
	}
	

}
