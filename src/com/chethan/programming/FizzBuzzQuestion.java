package com.chethan.programming;

public class FizzBuzzQuestion {
	
	
	/*
	 * 
	 *   Input 2 3 15
	 * 
	 * 
	 * 
	 * 
	 * 
	 *   Output 
	 * 
	 *      1
			2
			Fizz
			1
			2
			Fizz
			4
			Buzz
			Fizz
			7
			8
			Fizz
			Buzz
			11
			Fizz
			13
			14
			FizzBuzz
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
  public static void main(String[] args){ 
	 for(int i = 0; i< args.length; i++){
		 if(Integer.valueOf(args[i]) == 3){
			 System.out.println("Fizz");
		 }else if(Integer.valueOf(args[i]) == 5){
			 System.out.println("Buzz");
		 }else {
			 print(Integer.valueOf(args[i]));
		 }
		 
	 } 
   }
  
  public static void print(int number){
		 for(int i = 1;i<=number;i++){	
				if(i % 15 == 0) {
					System.out.println("FizzBuzz");
				}else  if(i % 3 == 0 ){
					System.out.println("Fizz");
				}else if(i % 5 == 0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
			}
	      }


}
