package program.test;

import java.util.ArrayList;
import java.util.List;


public class SeriesTest {
	
	static void getFibonancySeries(int limit) {		
		int firstValue = 0, secondValue=1, nextValue;
		List<Integer> list = new ArrayList<Integer>();
		list.add(firstValue);
		list.add(secondValue);		
		for(int i =0; i<limit;i++) {
			nextValue = firstValue+secondValue;
			//System.out.print(nextValue);
			list.add(nextValue);
			firstValue = secondValue;
			secondValue = nextValue;			
		}
		System.out.print(list.toString());
	}
	
	static boolean isPrime(int number) {
		//for(int i=2; i<number; i++){
		for(int i=2; i<number/2; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime
            }
        }
        return true; //number is prime now
	}	
	
	static int reverseNumber(int number) {
		int rest,reverse=0;
		while(number > 0) {
			rest = number % 10;
			reverse = reverse * 10 + rest;
			number /= 10;
		}
		return reverse;
	}
	
	static String reverseString(String str) {
		 //reverse an string value
		String reverseStr = "";
		if(!str.isEmpty()) {			
			   for(int i=0;i<str.length(); i++) {
				   char ch = str.charAt(i);				   
				   //reverseStr = reverseStr.concat(Character.toString(ch));
				   reverseStr = ch + reverseStr;
			   }
		}
		return reverseStr;  
	}
	
	static int factorialNumber(int number) {
		int result = 0;
		if(number >= 0) {
			if(number == 0 || number == 1) {
				result = 1;
			}else {
				result = number * factorialNumber(number-1);
			}			
		}
		return result;
	}
	
	static boolean isArmstrong(int number) {
		int temp=0;
		if(number > 0) {
			String string_number = Integer.toString(number);
			int len = string_number.length();
		
			for (int i = 0; i<len; i++) {
				char ch = string_number.charAt(i);
				int in = Character.getNumericValue(ch);
				int temp1 = (int) Math.pow(in, len);
	            temp += temp1;
	        }
		}
		if(temp == number) {
			return true;
		}else{
			return false;
		}
	}
	
	static int getRandomNumber(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	

	public static void main(String[] args) {
		// call fibonancy series
		getFibonancySeries(10);
		
		// find out prime numbers
		System.out.println("\nPrime numbers are ");
		int limit = 100;
		for (int i = 2; i < limit; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		//check is palindrome
		int rn = 106;
		System.out.print("\nIs Palindrome this number .. ");
		if(rn == reverseNumber(rn)) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
		System.out.print("\nIs Palindrome this string .. ");
		String pTest = "cosoc";		
		if(pTest.equals(reverseString(pTest))) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}

		//get factorial value
		int fn = 5;
		System.out.print("\nFactorial values .. ");
		System.out.print(factorialNumber(fn));
		
		//call is Armstrong number
		System.out.print("\nIs Armstrong this number .. ");
		System.out.print(isArmstrong(153));
		System.out.print("\ncheck another "+isArmstrong(134));
		System.out.print("\nFind out armstrong number .. ");
		// get Armstrong number from 1 to 1000
		for(int i=1;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.print(i+" ");
			}
		}
		
		// get random number
		System.out.print("\nget random number betwwen .. ");
		System.out.print(getRandomNumber(10,100));
		
		// show patern program
		System.out.print("\nshow patern program .. ");
		//Right Triangle Star Pattern
		System.out.println("");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("Another patern ");
		int i,j,row = 6;
		for (i = 0; i < row; i++) {
			//Left Triangle Star Pattern
			//for (j = 2*(row-i); j >= 0; j--) {
			//Pyramid Star Pattern
			for (j = row-i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// print char paterns
		System.out.println("pring character patern ");
		int letter = 65; //ASCII value of capital A is 65
		for (i = 0; i<= 9; i++)  
		{  
			//outer loop for columns  
			for (j = 0; j <= i; j++)  
			{  
			//prints the character  
			System.out.print((char) letter + " ");  
			}  
			letter++;  
			System.out.println();  
		}  
		
		//creating two instances of the Employee class  
		Person emp1 = new Person(918, "Maria");  
		Person emp2 = new Person(918, "Maria");  
		//invoking hashCode() method  
		int a=emp1.hashCode();  
		int b=emp2.hashCode();  
		System.out.println("hashcode of emp1 = " + a);  
		System.out.println("hashcode of emp2 = " + b);  
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
		
		
		
		
		
	}

}
