package com.chethan.programming;

/**
 * @author CAE5KOR
 *
 */
public class TaskOneCodingQuestion {
	
	/** 
	 * 
	 * @author CHETHAN CHIRAG REDDY
	 * 
	 * There are N Coins,Each showing either heads or tails,We would like all the coins to form a sequence of alternating heads and tails.
	 * What is the minimum number of coins that must be reversed to achieve this ?
	 * 
	 * Write a function:
	 * 
	 *   class Solution { public int sloution(int A[]);}
	 *   
	 *   that,given array A Consisting  of N integers representing the coins,returns the minimum number of coins that must be reversed .
	 *   Consecutive elements of array A represent consecutive coins and contains either a 0(heads) or a 1(tails).
	 *   
	 *   
	 *   Example :
	 *   
	 *   1.Given array A =[1,0,1,0,1,1], the function should return 1.After reversing the sixth coin,We achieve an alternating sequence  of coins[1,0,1,0,1,0].
	 *   
	 *   2.Given array A=[1,1,0,1,1],the function should return 2,After reversing the first and fifth coins,we achieve an alternating sequence[0,1,0,1,0].
	 *   
	 *   3.Given array A = [0,1,0] ,the function should return 0,The sequence of coins is already alternating.
	 *   
	 *   4.Given array A = [0,1,1,0],the function should return 2,We can reverse the first and second coins to get the sequence [1,0,1,0]
	 *   
	 *   Assume that:
	 *   
	 *   . N is an integer within the range[1..100]
	 *   . each elements of array A is an integer that can have one of the following values:0,1
	 *   
	 * 
	 * 
	 * 
	 */
	
	
	 public static void main(String[] args) {
		 
		 int[] testcase1 = {1,0,1,0,1,1}; // result 1
		 int[] testcase2 = {1,1,0,1,1}; // result = 2
		 int[] testcase3 = {0,1,0};  // result = 0
		 int[] testcase4 = {0,1,1,0}; // result = 2
		
		 int result  = solution(testcase2);
		 System.out.println("Result   "+result );
		
	 } 
	
	public static int solution(int[] A){
	    int n = A.length;
	    int result = 0;
	    
	    for(int i=0;i<n-1;i++){
	    	if(A[i] == A[i+1]){
	    		result = result+1;
	    	}
	    }
	    
	    int reverse  = -1;
	    
	    for(int i=0;i<n;i++){
	    	int count  = 0;
	    	
	    	if(i>0){
	    		if(A[i-1]!=A[i])
	    		count = count + 1;
	    		else
	    		count = count -1;	
	    	}
	    	
	    	if(i< n-1){
	    		if(A[i+1]!=A[i])
	    			count = count + 1;
	    			else
	    			count = count -1;	
	    		}
	    	     reverse = Math.max(reverse, count);
	    	   
	    	}
	       return result+reverse;
	    }

	
}
