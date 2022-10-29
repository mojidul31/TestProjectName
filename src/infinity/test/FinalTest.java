package infinity.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FinalTest {
	
	static boolean isPrime(int n) {
		boolean result;
		if(n<2) result = false;
		else result = true;
		
		for(int i=2; i<=n/i; i++) {
			if((n%i) == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	static boolean isPewerTwo(int n) {
		if(n==0)
		    return false;
		
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) 
				== (int)(Math.floor((Math.log(n) / Math.log(2))));		
	}
	
	static boolean isPowerNumber(int n, int power) {
		if(n == 0) return false;
		return (int)Math.ceil(Math.log(n) / Math.log(power)) == (int)Math.floor(Math.log(n) / Math.log(power));
	}
	
	static void fibonancySeries(int max) {
		int firstNo = 0,secondNo=1, tempNo = 0;
		System.out.print("Fibonancy series are "+firstNo+","+secondNo+",");
		while(max>1){
			tempNo = firstNo + secondNo;
			System.out.print(tempNo+",");
			firstNo = secondNo;
			secondNo = tempNo;
			max--;
		}		
	}
	
	static int reverseNumber(int n) {
		int rest,temp=0;		
		while(n>0) {
			rest = n % 10;
			temp = temp * 10 +rest;
			n /= 10;				
		}
		
		return temp;
	}
	
	static String reverseString(String str) {
		String reverseStr = "";
		int len = str.length();
		for (int i = len-1; i >= 0; i--) {
			char ch = str.charAt(i);
			//reverseStr += ch;
			reverseStr = ch + reverseStr;
		}
		return reverseStr;
	}
	
	static double calculateSimpleInterest(double principle, double interestRate, int time) {
		return (principle * interestRate * time) / 100;
	}
	
	static double calculateCompoundInterest(double principle, double interestRate, int time, int n) {
		return (principle * Math.pow((1+ (interestRate/100)/n),n*time)) - principle;
	}
	
	static String result(double totalMark, int noOfSubject) {
		String res = "F";		
		if(totalMark > 0) {
			int temp = (int)(totalMark / noOfSubject);
			//System.out.print("\ntemp="+temp);
			switch(temp){
				case 80:
					res = "A+";
				break;
				case 70:
					res = "B";
					break;
				case 60:
					res = "C";
					break;
				case 45-59:
					res = "D";
					break;
				case 36-44:
					res = "E";
					break;
				default:
					res = "F";
					break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		//calculate simple interest
		System.out.println("");
		System.out.println("Simple Interest "+ calculateSimpleInterest(1000,5,2));
		System.out.println("Compound Interest "+ calculateCompoundInterest(1000,5,2,1));
		
		//check palindrome string
		System.out.println("");
		String strw = "cosoc";
		if(reverseString(strw).equals(strw)){
			System.out.println("Palindrome string");
		}else {
			System.out.println("Not a palindrome string");
		}
		
		//check Palindrome number
		int rtv = 122;
		if(reverseNumber(rtv) == rtv){
			System.out.println("Palindrome number");
		}else{
			System.out.println("Not a palindrome number");
		};
		
		//fibonancy series
		System.out.println("");
		fibonancySeries(10);
		
		// check prime number
		System.out.println("");
		System.out.print("Check prime "+isPrime(17));
		
		// findout prime number between 1 to 50
		System.out.println("");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 50; i++) {
			if(isPrime(i)) {
				list.add(i);
				//System.out.print(i+",");
			}
		}
		System.out.print(list.toString());
		
		// findout array list same value
		System.out.println("");
		int[] arr = {2,4,5,6,7,8,9,2,3,5,9};		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]){
					System.out.print(arr[i]+" ");
				}
			}
		}
		
		// find out 1 to 100 which power 2
		System.out.println("");
		//list = new ArrayList<Integer>();
		for (int i = 2; i <= 100; i++) {
			if(isPewerTwo(i)) {
				//list.add(i);
				System.out.print(i+",");
			}
		}
		
		// find out 1 to 100 which power 2
		System.out.println("");
		//list = new ArrayList<Integer>();
		for (int i = 2; i <= 100; i++) {
			if(isPowerNumber(i,3)) {
				//list.add(i);
				System.out.print(i+",");
			}
		}
		//System.out.print(list.toString());
		
		// find out duplicate word only once show
		System.out.println("");
		String sentance = "Java is a programming language. Java Java Python is also a programming language.";
		//Converts the string into lowercase    
		sentance = sentance.toLowerCase();		
		String[] senArr = sentance.split(" ");
		//one solution
		List<String> repeatedWords = new ArrayList<>();
		//HashSet<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
		for (String str1 : senArr) {
			if(!hash.add(str1))
					repeatedWords.add(str1);
		}
		System.out.print("Repeated words are "+repeatedWords.toString());
		System.out.println("");
		System.out.print("All words "+hash.toString());
		//another solution
		System.out.print("\nAnother solution are ");
		int count;
		for (int i = 0; i < senArr.length; i++) {
			count = 1;
			for (int j = i+1; j < senArr.length; j++) {
				if(senArr[i].equals(senArr[j])) {
					count++;
					senArr[j]="0";
				}
			}
			if(count > 1 && senArr[i] != "0") {
				//System.out.print(senArr[i]+",");
				if(senArr[i].length() % 2 == 0) {
					System.out.print(senArr[i]+",");
				}
			}
		}
		//find out even word from the sentance
		String sentance1 = "Java is a programming language. Python is also a programming language.";
		//Converts the string into lowercase    
		sentance1 = sentance1.toLowerCase();		
		String[] anotherArr = sentance1.split(" ");		
		System.out.print("\nEven word from sentence are ");
		for(String str2 : anotherArr) {
			if(str2.length() % 2 == 0) {
				System.out.print(str2+",");
			}
		}
		System.out.println("");
		one:{
			second:{
				third:{
				for (int i = 0; i < 5; i++) {
					System.out.print(" "+"Label One " + i);
					//if(i == 4) break third;
					if(i==3) break second;
					//if(i == 2) break one;
				}				
			}
			System.out.print("Label Two");
			}
			System.out.print("Label Three");
		}
		
		int[] marks = {89,76,67,98,76,98,99,89,99,97};
		int noOdSubject = marks.length;
		int totalMark=0;
		for(int mark: marks) {
			totalMark += mark;
		}
		System.out.println("");
		System.out.print(result(totalMark,noOdSubject));
		int tempMax=0;
		for(int mark: marks) {
			if(mark > tempMax) {
				tempMax = mark;
			}
		}
		System.out.print("\n Max = "+tempMax);		
		int[] marks1 = {89,76,67,98,76,98,99,89,99,97};
		HashSet<Integer> arrColl = new HashSet<Integer>();
		//List<Integer> newMarkList = new ArrayList<Integer>();
		for(int mark: marks1) {
			/*if(arrColl.add(mark)) {
				newMarkList.add(mark);
			}*/
			arrColl.add(mark);
		}
		
		/*if(newMarkList.size() > 0) {
			for(int mark: newMarkList) {
				if(mark%2 == 0) {
					System.out.print(mark+",");
				}
			}
		}*/
		System.out.print("\n Distinct numbers are = ");
		for(int mark:arrColl) {
			System.out.print(mark+",");			
		}
		System.out.print("\n Even numbers are = ");
		for(int mark:arrColl) {
			if(mark%2 == 0) {
				System.out.print(mark+",");
			}
		}
		System.out.print("\n Odd numbers are = ");
		for(int mark:arrColl) {
			if(mark%2 != 0) {
				System.out.print(mark+",");
			}
		}
		
		// HashSet not measure order
		HashSet<Integer> hashTest = new HashSet<Integer>();
		hashTest.add(34);
		hashTest.add(31);
		hashTest.add(54);
		System.out.print("\n check order of hash are = "+hashTest.toString());
		System.out.print("\n Order by ascending of array are = ");
		int[] marks2 = {89,76,67,98,77,91,93,83,99,97};
		for (int i = 0; i < marks2.length; i++) {
			for (int j = i+1; j < marks2.length; j++) {
				if(marks2[i] > marks2[j]) {
					int temp = marks2[i];
					marks2[i] = marks2[j];
					marks2[j] = temp;
				}
			}
		}
		for(int mark:marks2) {
			System.out.print(mark+" ");
		}
		System.out.print("\n Order by descending of array are = ");
		for (int i = 0; i < marks2.length; i++) {
			for (int j = i+1; j < marks2.length; j++) {
				if(marks2[i] < marks2[j]) {
					int temp = marks2[i];
					marks2[i] = marks2[j];
					marks2[j] = temp;
				}
			}
		}
		for(int mark:marks2) {
			System.out.print(mark+" ");
		}
		
		// series test
		//1+2+3+4+....N
		int noOfNo = 100;
		int sum=0;
		for (int i = 0; i <= noOfNo; i++) {
			sum += i;
		}
		System.out.print("\n Sum of 1+2+3+4+....100 = "+sum);
		//1 Square2 + 3 Square2 + 5 Square2+....N Square2
		sum=0;
		for (int i = 1; i <= noOfNo; i+=2) {
			sum += Math.pow(i, 2);
		}
		System.out.print("\n Sum of 1 Square2 + 3 Square2 + 5 Square2+....N Square2 = "+sum);
		//1 Square2 - 2 Square2 + 3 Square2 - 4 Square2 + 5 Square2-....+N Square2
		sum = 0;
		int plusSum=0;
		int minusSum=0;
		for (int i = 1; i < noOfNo; i++) {
			if(i%2 == 0) {
				minusSum +=Math.pow(i, 2);
			}else {
				plusSum+=Math.pow(i, 2);
			}
		}
		sum = plusSum - minusSum;
		System.out.print("\n Sum of //1 Square2 - 2 Square2 + 3 Square2 - 4 Square2 + 5 Square2-....+N Square2 = "+sum);
		// find 10 prime number
		System.out.print("\n prime numbers using for loop are      ");
		//using for loop
		for (int i = 0; i < 20; i++) {
			if(isPrimeAgain(i)) {
				System.out.print(" "+i);
			}
		}
		// using while loop
		System.out.print("\n prime numbers using while loop are    ");
		int wi = 0;
		while(20 > wi) {
			if(isPrimeAgain(wi)) {
				System.out.print(" "+wi);
			}
			wi++;
		}
		
		// using do while loop
		System.out.print("\n prime numbers using do while loop are ");
		wi = 0;
		do {
			if(isPrimeAgain(wi)) {
				System.out.print(" "+wi);
			}
			wi++;
		}while(20 > wi);
		
		//using for loop find factorial
		int factNo = 1;
		for (int i = 1; i < 6; i++) {
			factNo *= i;
		}
		System.out.print("\n factorial value using for loop are "+factNo);
		factNo = 1;
		int wv = 1;
		while(5>wv) {
			factNo *= wv;
			wv++;
		}
		System.out.print("\n factorial value using while loop are "+factNo);
		System.out.print("\n string reverse test are ");
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print(reverseStringAgain(alphabets));
		
		System.out.print("\n int reverse test are ");
		int revint = 123;
		System.out.print(reverseIntAgain(revint));
		
		System.out.print("\n get max test are ");
		int[] maxs = {123, 178,143};
		System.out.print(getMax(maxs));
		
		// using while loop sum of first five prime number
		System.out.print("\n prime numbers using while loop are    ");
		int ffn = 0;
		int fc = 1;
		int fsum = 0;
		while(20 > ffn) {
			if(isPrimeAgain(ffn)) {
				fsum += ffn;
				fc++;
				if(fc > 5) {
					break;
				}
			}
			ffn++;
		}
		System.out.print("\n Sum of first five prime no. are "+fsum);
		
		int firstNo=1, secondNo=1, tempNo,fiboc_int = 2,fiboSum=0;		
		fiboSum = firstNo+secondNo;
		while(5 > fiboc_int) {
			tempNo = firstNo+secondNo;
			fiboSum +=tempNo;
			firstNo = secondNo;
			secondNo = tempNo;
			fiboc_int++;
		}		
		System.out.print("\n Sum of first fibonancy no. are "+fiboSum);
		
		//another way to get fibonancy series
		final int MAX = 10;
		int[] fibo = new int[MAX];
		fibo[0]=1;
		fibo[1]=1;
		for (int i = 2; i < MAX; i++) {
			fibo[i]=fibo[i-2]+fibo[i-1];
		}
		System.out.print("\n First ten fibonancy no. are ");
		for(int in : fibo) {
			System.out.print(in+" ");
		}
		
		// two dimensional array example
		System.out.println("");
		System.out.println("Two dimensional arrays are ");
		int[][] twoDimensionalArrays = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] twoDimensionalArrays1 = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] twoDimenNext = new int[3][3];
		int arrLen = twoDimensionalArrays.length;		
		for (int i = 0; i < twoDimensionalArrays.length; i++) {
			for (int j = 0; j < twoDimensionalArrays.length; j++) {
				System.out.print(twoDimensionalArrays[i][j]+" ");
			}
			System.out.println("");
		}
		//System.out.println("len"+arrLen);
		for (int i = arrLen-1; i >= 0; i--) {
			for (int j = arrLen-1; j >= 0; j--) {
				System.out.print(twoDimensionalArrays[i][j]+" ");				
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < twoDimensionalArrays.length; i++) {
			for (int j = 0; j < twoDimensionalArrays.length; j++) {
				twoDimenNext[i][j] = twoDimensionalArrays[i][j] + twoDimensionalArrays1[i][j];
			}
			System.out.println("");
		}
		
		System.out.println("");
		for (int i = 0; i < twoDimenNext.length; i++) {
			for (int j = 0; j < twoDimenNext.length; j++) {
				System.out.print(twoDimenNext[i][j]+" ");
			}
			System.out.println("");
		}		
		//System.out.println(twoDimenNext);
		//StringBuilder has reverse method
		String sth = "Molina";
		StringBuffer revString1 = new StringBuffer(sth);
		System.out.println("Reverse "+revString1.reverse());
		// compare string
		String sth1= "Molina";
		String sth2= "Molina";
		if(sth1.compareTo(sth2) == 0) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		if(sth1.equalsIgnoreCase(sth2)) {
			System.out.println("Using Ignore Case Equal");
		}else {
			System.out.println("Using Ignore Case Not equal");
		}
		
		System.out.println("\nDistince words are ");
		String eStr = "Java Program Java Program Java Is a Best Programming Language.";
		eStr = eStr.toLowerCase();
		String[] strSplit = eStr.split(" ");
		//HashSet<String> eHashSet = new HashSet<String>();
		int spCount=0;
		for (int i = 0; i < strSplit.length; i++) {
			spCount = 1;
			for (int j = i+1; j < strSplit.length; j++) {
				if(strSplit[i].equals(strSplit[j])) {
					spCount++;
					strSplit[j] = "o";
				}				
			}
			if(spCount > 1 && strSplit[i] != "o") {
				//System.out.print(strSplit[i]+",");
				if(strSplit[i].length() %2 ==0) {
					System.out.print(strSplit[i]+",");
				}
			}
		}
		
		double ff = 56.56454;
		System.out.print("ceil "+Math.ceil(ff));
		System.out.print("floor "+Math.floor(ff));
		BigDecimal bdn = new BigDecimal(Double.toString(ff));
		System.out.print("\nplace "+bdn.setScale(3,BigDecimal.ROUND_HALF_DOWN));
		System.out.print("\nplace "+bdn.setScale(3,BigDecimal.ROUND_HALF_UP));
		System.out.print("\nplace "+bdn.setScale(3,BigDecimal.ROUND_CEILING));
		System.out.print("\nplace "+bdn.setScale(3,BigDecimal.ROUND_FLOOR));
		
		
	// last in main method	
	}
	
	static boolean isPrimeAgain(int n) {
		boolean result;
		if(n<2) result = false;
		else result = true;
		
		for (int i = 2; i < n/i; i++) {
			if(n%i==0) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	static String reverseStringAgain(String str) {
		String revereStr = "";
		int len = str.length();
		for (int i = len-1; i >= 0; i--) {
			char ch = str.charAt(i);
			revereStr += ch;			
		}
		return revereStr;
	}
	
	static int reverseIntAgain(int n) {
		int rest,reverse=0;
		while(n>0) {
			rest = n%10;
			reverse = reverse*10 + rest;
			n /=10;
		}
		return reverse;
	}
	
	static int getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = arr[i];
				}					
			}
		}
		return max;
	}
}
