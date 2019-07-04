package com.chethan.programming;

/**
 * @author Chethan Chirag Reddy
 *
 */
public class Median_of_Two_Sorted_Arrays {

	
	/*
	 *          There are two sorted arrays nums1 and nums2 of size m and n respectively.

				Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

				You may assume nums1 and nums2 cannot be both empty.

				Example 1:
				
				nums1 = [1, 3]
				nums2 = [2]
				
				The median is 2.0
				Example 2:
				
				nums1 = [1, 2]
				nums2 = [3, 4]
				
				The median is (2 + 3)/2 = 2.5
	 * 
	 */
	
	
	class Solution{
		
		public double findMedianSortedArrays(int[] num1,int[] num2){
			int total = num1.length+ num2.length;
			
			if(total%2 == 0){
				return (getKth(num1, 0, num1.length-1, num2, 0, num2.length-1, total/2) 
			              + getKth(num1, 0, num1.length-1, num2, 0, num2.length-1, total/2-1))/2.0;
			}else{
				 return getKth(num1,0, num1.length-1, num2, 0, num2.length-1, total/2);
			}
		}
		
	   public int getKth(int[] num1,int i1,int j1,int[] num2,int i2,int j2,int K){
		   if(j1<i2){
			   return num2[i2+K];
		   }
		   
		   if(j2<i2){
			   return num1[i1+K];
		   }
		   
		   int len1 = j1 - i1 +1;
		   int len2 = j2 -i2 +1;
		   
		   
		   int m1  = K*len1/(len1+len2);
		   int m2  = K - m1 -1;
		   
		   if(num1[m1]<num2[m2]){
			   
			   K  = K-(m1-i1+1);
			   j2 = m2;
			   i1 = m1+1;
			   
		   }else{
			   K = K -(m2-i2+1);
			   j1 = m1;
			   i2  = m2+1;
		   }
		   return getKth(num1, i1, j1, num2, i2, j2, K);
	    }
	   
	 }
	
}
