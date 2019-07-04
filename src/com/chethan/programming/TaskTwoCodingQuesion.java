package com.chethan.programming;

import java.util.Arrays;

public class TaskTwoCodingQuesion {
	
	/** 
	 * @author CHETHAN CHIRAG REDDY
	 * 
	 * Integer V lies Strictly between integers U and W if U < V <W or if U> v >W
	 * 
	 * A non-empty array A Consists of N integers is given.A pair of indices(p,Q),Where 0 <= p < Q < N,is said to have adjacent values 
	 * if no value in the array lies strictly between values A[p] and A[Q],and in addition A[p] ≠ A[Q]
	 * 
	 * 
	 * For Example, in the array A Such that:
	 * 
	 * A[0] = 0
	 * A[1] = 3
	 * A[2] = 3
	 * A[3] = 7
	 * A[4] = 5 
	 * A[5] = 3 
	 * A[6] = 11
	 * A[7] = 1
	 * 
	 * the following pairs of the indices have adjacent values:
	 * 
	 * 
	 *  (0, 7), (1, 2), (1, 4),
		(2, 5), (2, 7), (3, 4),
		(3, 6), (4, 5), (5, 7).
	 * 
	 * 
	 * For example, indices 4 and 5 have adjacent values because there is no value in array A that lies 
      strictly between A[4] = 5 and A[5] = 3; the only such value could be the number 4, 
      and it is not present in the array.
      Write a function that returns number of adjacent values
	 * 
	 */
	
	 public static void main(String[] args) {
		 int[] testcase = {1,4,7,3,3,5};
		 int result = solutions(testcase);
		 System.out.println("Result "+testcase);
	 }
	
	 public  static int solutions(int[] A){
		 if(A.length == 0 || A.length ==0){
			 return 0;
		 }
		 
		 Arrays.sort(A);
		 
		 int prev = A[0];
		 
		 int currentcount  = 1;
		 
		 int previouscount = 0;
		 
		 int result = 0;
		 
		 for(int i=1;i<A.length;i++){
			 
			 if(A[i] == prev){
				 currentcount++;
				 result +=  previouscount+currentcount -1;
			 }else{
				 result += currentcount;
				 previouscount =currentcount;
				 currentcount = 1;
			 }
			 prev = A[i];
		 }
		 return result;
				 
	 }

}
