package program.test;

public class DigitProgram {
	
	static int totalDigit(int number) {
		int count =0;
		if(number > 0) {
			while(number != 0) {
				count++;
				number /=10;
			}
		}
		return count;
	}
	
	static int getLastDigit(int number) {
		int lastDigit =0;
		if(number > 0) {
			lastDigit = number%10;
		}
		return lastDigit;
	}
	
	static int sumOfFirstAndLastDigit(int number) {
		// declare variables
	     int lastDigit, firstDigit, divisor;;
	     int totalDigits = 0;
	     int sum = 0;

	     // find last digit
	     lastDigit = number%10;

	     // find total number of digits
	     totalDigits = totalDigit(number);
	     
	     // calculate divisor value
	     divisor = (int)Math.pow(10, totalDigits-1);
	     
	     // find first digit
	     firstDigit = number / divisor;
	     
	     sum = firstDigit + lastDigit;
	     return sum;	     
	}
	
	static int lastNoOfSpecificDigit(int number, int noOfdigit) {
		int result = 0;
		if(number > 0) {
			String str = String.valueOf(number);
			str = str.substring(str.length()-noOfdigit);
			result = Integer.parseInt(str);
		}
		return result;
	}
	
	static int factorialOfNumber(int number) {
		int result = 0;
		if(number == 0 || number == 1) {
			result = 1;
		}
		
		if(number > 1) {
			result = number * factorialOfNumber(number-1);
		}
		return result;
	}
	
	static double squareRoot(int num)   
	{  
		//temporary variable  
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;
		}   
		while((t-sqrtroot)!= 0);  
		// return (int)sqrtroot;
		return sqrtroot; 
	}
	
	static boolean isSunnyNumber(int number) {
		double result = 0;
		if(number > 0) {
			result = Math.sqrt(number+1);
		}
		if(result - (int)result != 0) {
			return false;
		}else {
			return true;
		}
	}

	public static void main(String[] args) {
		
		Double[] darr = {100.43d, null, 120.65d};
		for(double d : darr){
			System.out.print(d);
		}
		
		
		
		
		
		
		
		int d = 72348;
		//check total digit in number
		System.out.print("Check total digit = ");
		System.out.print(totalDigit(d));
		
		//check total digit in number
		System.out.print("\nGet last digit = ");
		System.out.print(getLastDigit(d));
		
		//how to get sum of first and last digit
		System.out.print("\nSum of first and last digit = ");
		System.out.print(sumOfFirstAndLastDigit(d));
		
		//how to get last specific digit
		System.out.print("\nLast specific digit = ");
		System.out.print(lastNoOfSpecificDigit(d,2));
		
		// how to get automorphic number
		int atmn = 76; // 76*76 == 5776 last two digit same as atmn value
		//int atmn = 23; // 23*23 == 529 last two digit not as atmn value
		int squareAtmn = 76*76;
		int lastTwoDigit = lastNoOfSpecificDigit(squareAtmn,2);
		if(atmn == lastTwoDigit) {
			System.out.print("\nIt is an automorphic number");
		}else {
			System.out.print("\nNot automorphic number");
		}
		
		//Find Peterson Number
		int pn = 145;
		int ptotal=0;
		String pstr = String.valueOf(pn);
		for(int i=0; i<pstr.length();i++) {
			int ch = Character.getNumericValue(pstr.charAt(i));			
			ptotal += factorialOfNumber(ch);
		}
		if(pn == ptotal) {
			System.out.print("\nIt is Peterson number"+ptotal);
		}else {
			System.out.print("\nNot Peterson number"+ptotal);
		}
		
		//find square root
		int sqn = 16;
		System.out.print("\nSquare root number ");
		System.out.print(squareRoot(sqn));
		
		//Find Sunny Number
		int sn = 80;
		//int sn = 10;
		System.out.print("\nSunny number "+isSunnyNumber(sn));
		
	}

}
