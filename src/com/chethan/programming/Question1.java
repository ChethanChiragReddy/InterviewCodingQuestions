package com.chethan.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question1 {
	
	/*
	 * Given an array numbers of n integers,are there elements a,b,c in numbers 
	 * such that a+b+c =0?Find all unique triplets in the array which gives 
	 * the sum of zero.
	 * 
	 * Note : The Solution set must not contain duplicate triplets .
	 * 
	 * Example :
	 * 
	 * Given array numbers =[-1,0,1,2,-1,-4],
	 * 
	 * A  solution set is:
	 * 
	 * [
	 *   [-1,0,1]
	 *   [-1,-1,2]
	 * ]
	 * 
	 * 
	 *
	 */
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4}; 
		
		ArrayList<ArrayList<Integer> > triplets = findTriplets(nums); 
		  
        if (!triplets.isEmpty()) { 
            System.out.println(triplets); 
        } else { 
            System.out.println("No triplets can be formed"); 
        } 
		
	}
	
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] num){
		
		Arrays.sort(num);
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashSet tripletSet  = new HashSet();
		
		int numsize = num.length;
		if(numsize < 3) return result;
		
		for(int i=0;i<numsize -2;i++){
			int first  = i+1;
			int last = numsize - 1;
			
			int traget = 0 - num[i];
			
			while(first < last){
				int sumtwo = num[first] +num[last];
				if(sumtwo <traget) first++;
				else if(sumtwo >traget) last--;
				else{
					ArrayList<Integer> triplet = new ArrayList<Integer>();
					
					triplet.add(num[i]);
					triplet.add(num[first]);
					triplet.add(num[last]);
					if(tripletSet.add(triplet)) result.add(triplet);
					first++;
					last--;
					
				}
			}
		}
		return result;
	}
	
	

}
