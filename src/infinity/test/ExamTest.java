package infinity.test;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.Scanner;

public class ExamTest {

	static int getNumberFromRomanNumber(char ch) {
		int result = 0;
		switch(ch) {
		case 'M':
			result = 1000;
			break;		
		case 'D':
			result = 500;
			break;
		case 'C':
			result = 100;
			break;
		case 'L':
			result = 50;
			break;
		case 'X':
			result = 10;
			break;
		case 'V':
			result = 5;
			break;
		case 'I':
			result = 1;
			break;
		default:
			result = 0;
			break;
			}
		return result;
		}
	
	static int convertToAbs(int a) {
		return a >= 0? a : -a;
	}
	
	static boolean getStatus(int a, int b) {
		if(a == 15 || b == 15) {
			return true;
		}else if(a+b == 15) {
			return true;
		//}else if((Math.abs(a)- Math.abs(b)) == 15){
		}else if(Math.abs(a-b) == 15){
			return true;
		}else {
			return false;
		}
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
	
	static int summationInteger(int upto) {
		int result = 0;
		if(upto > 0) {
			result = upto + summationInteger(upto-1);
			upto--;
		}
		return result;		
	}
	
	static int reverseInt(int gh) {
		int rest=0,reverse = 0;
		while(gh > 0) {
			rest = gh % 10;
			reverse = reverse * 10 + rest;
            gh /= 10;
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
	
	static List<Integer> getFibonancies(int n){		
		List<Integer> series = new ArrayList<Integer>();
		if(n > 0) {
			int n1=0,n2=1,n3;
			series.add(n1);
			series.add(n2);
			for(int i=2;i<n;i++) {
				n3 = n1+n2;
				series.add(n3);
				n1 = n2;
				n2 = n3;				
			}			
		}
		return series;
	}
	
	static double simpleInterestCalc(double principal, double interestPercentage, double years)
	{
		// Simple Interest = (P × R × T)/100  
		//where P = Principal Amount, R = Rate per Annum, T = Time (years) 
		double simpleInterest = (principal * interestPercentage * years) / 100;
		return simpleInterest;
	}
	
	static double compoundInterestCalc(double principal, double interestPercentage, double years, int intervalMonth) {
		//P (1 + R/n) (nt) - P
		//Here P is principal amount.
		//R is the annual interest rate.
		//t is the time the money is invested or borrowed for.
		//n is the number of times that interest is compounded per unit t, for example if interest is compounded monthly and t is in years then the value of n would be 12. 
		double interestRate = interestPercentage/100;
		double calc = Math.pow((1+ (interestRate / intervalMonth)), (intervalMonth*years));		
		double compoundInterest = principal * calc - principal;
		return compoundInterest;
	}
	
	static String[] getSplitStringArr(String str, String ch, int limit) {
		String[] strArray = null;
		if(!str.isEmpty()) {
			if(limit >0) {
				strArray = str.split(ch, limit);
			}
			else {
				strArray = str.split(ch);
			}
		}
		return strArray;
	}
	
	static boolean isPowerOfTwo(int n)
	{
	    if(n==0)
	    return false;
	  
	    return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
	       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	
	
	
	
	// main method
	public static void main(String[] args) {
		
		//search same type number
		int[] arrList = {2,4,3,6,3,2,1};
		
		
		//power of 2 from 1 to 100
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 3; i<100;i++) {
			if(isPowerOfTwo(i)) {
				list.add(i);
				//System.out.print(i+",");  
			}
		}
		if(list.size() > 0) {
			System.out.println(list.toString());  
		}
		System.out.println("\n ==============================");
		//System.out.println(24/10);  
		
		// //Creating HashSet and adding elements  
	    HashSet<String> setHashSet = new HashSet();  
	    setHashSet.add("One");    
	    setHashSet.add("Two");    
	    setHashSet.add("Three");   
        setHashSet.add("Four");  
        setHashSet.add("Five");  
        Iterator<String> ia=setHashSet.iterator();  
        while(ia.hasNext())  
        {  
        System.out.println(ia.next());  
        }  
        System.out.println("==============================");
		//string split
		String strsa = "nayeem@for@mojidul";
		//String[] strArray = getSplitStringArr(strsa,"@",0);
		String[] strArray = getSplitStringArr(strsa,"@",4);
		for (String a : strArray) {
			System.out.println(a);
		}
            
		
		//float a = 35 / 0; // runtime error ArithmeticException
		//System.out.println("infinity "+ a);
		
		//string reverse call
		System.out.println("Reverse String "+reverseString("abcd"));
				
		// calculate simple and compound interest
		double principal = 3000;
		double interestPercentage = 10;
		double years = 5;
		System.out.println("Simple Profit "+simpleInterestCalc(principal, interestPercentage, years));
		int intervalMonth = 12;
		System.out.println("Compound Profit "+compoundInterestCalc(principal, interestPercentage, years, intervalMonth));
		
		//Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		System.out.println("Fibonacci series "+getFibonancies(10).toString());
		
		//find value of -19+ 7x- 4x2 + 6x3
		int p =3;
		double summ = -19+(7*p)-4 * (Math.pow(p,2))+6*(Math.pow(p, 3));
		System.out.println("series "+summ);
		
		//find the palindrome int number
		//int gf1 = 121;
		int gf1 = 123;
		int gf2 = reverseInt(gf1);
		if(gf1 == gf2) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		//summary of upto any integer		
		System.out.println("sum "+summationInteger(4));
		
		//count the number of prime numbers
		int aaa = 15;
		int count11 = 0;
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for(int i=2;i<aaa;i++) {
			if(isPrime(i)) {
				count11++;
				primeNumbers.add(i);				
			}			
		}
		System.out.println("count "+count11);
		System.out.println("primes numbers are "+primeNumbers.toString());
		
		//Accept two integers and return true if the either one is 15 or if their sum or difference is 15
		System.out.println("check "+getStatus(-27,-12));
		
		
		//convert an integer value to absolute value
		//Scanner in = new Scanner(System.in);
		//int dd = in.nextInt();
		int dd = 23;
		System.out.printf("Original value %d, absolute value %d",dd, convertToAbs(dd));
		
		//convert Roman number to an integer number
		int result = 0;
		String str = "DCCVII";
		int len = str.length();
		for(int i=0; i< len;i++) {
			char ch = str.charAt(i);
			result += getNumberFromRomanNumber(ch);
        }
       System.out.println("\nRoman Number: "+str);
	   System.out.println("Equivalent Integer: "+result+"\n");
	   
	   //reverse an string value
	   String strValue = "abcd";
	   int lent = strValue.length();
	   String reverseStr = "";
	   for(int i=0;i<strValue.length(); i++) {
		   char ch = strValue.charAt(lent-1);
		   lent -=1;
		   //char convert to string Character.toString(ch)
		   //int convert to int String.valueOf(10)
		   reverseStr = reverseStr.concat(Character.toString(ch));
	   }
	   System.out.println("Reverse string: "+reverseStr);
	   
		//reverse an integer number
		int gh = 342;
		int g = 0;
		g=reverseInt(gh);
		System.out.println("reverse integer "+ g);
		
		//count the absolute distinct value in an array
		//int[] intArr = new int[]{-1,-2,0,4,5,6,3,2,-3};
		int[] intArr = {-1,-2,0,-1, 4,4,6,3,2,-3};
		int count = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<intArr.length; i++) {
			int n = Math.abs(intArr[i]);
			if(!set.contains(n)) {
				set.add(n);
				count++;
			}
		}
		System.out.println("distinct count "+ count);
		
		// find integer value and decimal value
		double value = 45.78;
		double decimalPart = value % 1; 
		// casting
		// int integerPart = (int) ((int) value - decimalPart);
		int integerPart = (int)(value - decimalPart);
		System.out.println("original "+ value);
		System.out.println("decimal "+ decimalPart);
		System.out.println("integer "+ integerPart);
		
		// double number is an integer
		//double dd = 44.0;
		if(value % 1 == 0) {
			System.out.println("double number is an integer");
		}else {
			System.out.println("double number is not an integer");
		}
		// round up a float number
		float f1 = 345.85456f;
		//int f1 = 345456456; // no error shows decimal place 0000
		BigDecimal bd;
		int decimalPlace = 4;
		BigDecimal bd_num = new BigDecimal(Float.toString(f1));
		bd = bd_num.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
		System.out.println("Half Up"+bd);
		bd = bd_num.setScale(decimalPlace,BigDecimal.ROUND_HALF_DOWN);
		System.out.println("Half Down"+bd);
		bd = bd_num.setScale(decimalPlace,BigDecimal.ROUND_CEILING);
		System.out.println("Ceiling"+bd);
		bd = bd_num.setScale(decimalPlace,BigDecimal.ROUND_FLOOR);
		System.out.println("Floor"+bd);	
		
		
		
	}

}
