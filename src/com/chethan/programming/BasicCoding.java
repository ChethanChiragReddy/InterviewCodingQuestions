package com.chethan.programming;

import java.util.Objects;

/**
 * @author CHETHAN CHIRAG REDDY
 *
 */
public  class BasicCoding {
	
	public  boolean isPalidromeString(String pstr){
		String str = pstr, rev = "";
		
		int length = str.length();
		
		for(int i =length-1;i>=0;i--){
			rev = rev +str.charAt(i);
		}
		
		if(str.equals(rev)){
			return true;
		}else{
			return false;
		}
	}
	
	
	public boolean isPalidromenumber(int number){
		int reversedInteger = 0,remainder, originalInterger;
		
		originalInterger = number;
		while(number!=0){
			remainder  = number %10;
			reversedInteger = reversedInteger *10 +remainder;
			number  /= 10;
		}
		if(originalInterger == reversedInteger){
			System.out.println(originalInterger+"is a Palidrome ");
			return true;
		}else{
			System.out.println(originalInterger+"is not a  Palidrome ");
			return false;
		}
	}
	
	
	public  boolean isHexadecimal(String text) {
	    Objects.requireNonNull(text);
	    if(text.length() < 1)
	        throw new IllegalArgumentException("Text cannot be empty.");

	    char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
	            'a', 'b', 'c', 'd', 'e', 'f', 'A', 'B', 'C', 'D', 'E', 'F' };

	    for (char symbol : text.toCharArray()) {
	        boolean found = false;
	        for (char hexDigit : hexDigits) {
	            if (symbol == hexDigit) {
	                found = true;
	                break;
	            }
	        }
	        if(!found)
	            return false;
	    }
	    return true;
	}
	
	
	public  int Gcd(int num1,int num2){
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
		return gcd;
	}
	
	
	public void Fibonacciofnumber(int number){
		int a=0,b=1,c =0;
		for(int i=0;i<=number;i++){
		    c= a+b;
		    a = b;
		    b = c;
		    System.out.println(c);
		 
		}
	}
	
	public boolean isArmStrong(int number){
		int sum =0,temp,remainder,digits =0;
		temp = number;
		
		while(temp!=0){
			digits++;
			temp = temp/10;
		}
		
		temp = number;
		
		while(temp!=0){
			remainder = temp%10;
			sum = sum+power(remainder,digits);
			temp =temp/10;
		}
		
		if(number == sum)
			return true;
		else
			return false;	
		
	}


	private int power(int remainder, int digits) {
		int p=1;
		for(int i=1;i<=digits;i++){
			p = p*remainder;
		}
		return p;
	}
	
	
	public boolean isOddoreven(int number){
		return (number% 2 ==0) ?  true:false;
	}
	
	
	public void countVowels(String str){
	   String lstr = str;
		int vowels = 0,constants = 0, digits = 0,spaces =0;
		lstr = str.toLowerCase();
		
		for(int i=0;i<lstr.length();i++){
			char ch = lstr.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u') {
	                ++vowels;
	            }
			else if((ch >= 'a'&& ch <= 'z')) {
                ++constants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
		}
	}
	
	
	public void MultiplicationTable (int number){
		for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
	}
	
	
	public boolean isLeapYear(int year){
		boolean flag = false;
		if(year % 400 == 0){
			flag = true;
			
		}else if(year % 100 ==0){
			flag = false;
			
		}else if(year % 4 ==0){
			flag  = true;
			
		}
		else{
			flag = false;
		}
		if(flag){
		  System.out.println(year + "year is leaf year");
		}else{
			System.out.println(year + "year is not leaf year");
		}
      return flag;
	}
	
	
	public String[]	getReverseArray(String[] array){
		if(array == null || array.length <2){
			return array;
		}else{
			for(int i=0;i<array.length/2;i++){
				String temp = array[i];
				array[i] = array[array.length -1 -i];
				array[array.length-1-i] = temp;
			}	
		}
		return array;
	}
	
	
	public int[] BubbleSort(int[] arr){
		int n = arr.length;
	      int temp = 0;

	      for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) {
	            if(arr[j-1] > arr[j]) {
	               temp = arr[j-1];
	               arr[j-1] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
		return arr;
	}
	
	
	public  int lastdigit(int number){
		return (number% 10);
	}
	
	public  int firstdigit(int number){
		while(number >=10)
			number /= 10;
		return number;
	}
	
	
	public boolean isPrimeornot(int number){
		boolean isprime = true;
		
		for(int i=2;i<=number/2;i++){
			if(number % i  == 0){
				isprime  = false;
				break;
			}
		}
		return isprime;
	
	}
	
	public int factorial(int number){
		int i,fact =1;
		for(i=1;i<=number;i++){
			fact = fact * i;
		}
		return fact;
	}
	
	public String reverseString(String str){
		String reverse = "";
		for(int i=str.length() -1;i>=0;i--){
			reverse = reverse +str.charAt(i);
					
		}
		return reverse;
	}
	
	public void pushallzeroToEnd(int arr[],int n){
		int count =0;
		int temp; 
		for (int i = 0; i < n; i++) { 
		    if ((arr[i] != 0)) { 
		        temp = arr[count]; 
		        arr[count] = arr[i]; 
		        arr[i] = temp; 
		        count = count + 1; 
		   } 
	 } 
		
	}
	
	public int secondlargestnumber(int arr[]){
		  int largest  = arr[0];
		  int secondlargest = arr[0];
		  for(int i=0;i<arr.length;i++){
			  if(arr[i]> largest){
				  secondlargest = largest;
				  largest = arr[i];
			  }else if(arr[i]>secondlargest){
				  secondlargest= arr[i];
			  }
		  }
		  return secondlargest;
		  
	  }
	
	
	public void swappingTwoNumberWithoutThirdVariable(int x ,int y){
		x = x ^ y;
		y  = x ^ y;
		x = x ^ y;
		System.out.println("swappingTwoNumberWithoutThirdVariable " + x  +" " + y);
	}
	
	//Printing 1 to 100 in Java without using a loop.
	public void usingRecursion(int number){
		if(number > 1){
			usingRecursion(number -1);
		}
		System.out.println(number);
	}
	
	
	
	
}
