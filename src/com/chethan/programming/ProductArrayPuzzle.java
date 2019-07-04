package com.chethan.programming;

public class ProductArrayPuzzle {
	
	/*      Given an array of integers A, find and return the product array of same size where 
			i’th eement of the product array will be equal to the product of all the elements divided by the i’th element of the array.

			Note: It is always possible to form the product array with integer (32 bit) values.

			Input Format

			The only argument given is the integer array A.
			Output Format

			Return the product array.
			
			Constraints

			1 <= length of the array <= 1000
			1 <= A[i] <= 10
			For Example

			Input 1:
			    A = [1, 2, 3, 4, 5]
			Output 1:
			    [120, 60, 40, 30, 24]

			Input 2:
			    A = [5, 1, 10, 1]
			Output 2:
			    [10, 50, 5, 50]
			    
      */  
	
	public static void main(String[] args) {
		
		int[] testcase1 = {1, 2, 3, 4, 5};
		int[] testcase2 = {5, 1, 10, 1};
		
		int[] result = productarray(testcase1);
		System.out.println("resut array [");
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		System.out.println("]");

		
	}
	
	public static int[] productarray(int[] nums){
		
		int[] result = new int[nums.length];
		
		int[] t1 =new int[nums.length];
		int[] t2 =  new int[nums.length];
		
		t1[0] = 1;
		t2[nums.length -1] = 1;
		
		// scan left to right
		for(int i=0;i<nums.length-1;i++){
			t1[i+1] = nums[i] * t1[i];
		}
		
		// scan right to left
		for(int i=nums.length-1; i>0; i--){
			t2[i-1] = t2[i] * nums[i];
		}
		
		//mutiply both
		for(int i=0;i<nums.length;i++){
			result[i] = t1[i] * t2[i];
			
		}
		return result;
	}

}
