package infinity.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExamQuestionSolution {

	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<Double>();

		// find out distinct even word from a sentence
		String sentence = "Java Program Java Program Java Is a Best Programming Language.";
		sentence = sentence.toLowerCase();
		String[] splitString = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < splitString.length; i++) {
			count = 1;
			for(int j=i+1; j < splitString.length; j++) {
				if(splitString[i].equals(splitString[j])) {
					count++;
					splitString[j]="o";
				}	
			}
			if(count > 1 && splitString[i] != "o") {
				//System.out.print(splitString[i]+",");
				if(splitString[i].length() % 2 == 0) {
					System.out.print(splitString[i]+",");
				}
			}
		}
		
		// find out from 1 to 100 which is power of 2
		System.out.println("\n"+isPowerTwo(16));
		for (int i = 0; i <= 100; i++) {
			if(isPowerTwo(i)) {
				System.out.print(i+",");
			}
		}
		
		//find out more than one number in an array
		System.out.println("\ncontains more than one time");
		int[] intArr = {23,45,67,33,44,54,23,67,67,33};		
		HashSet<Integer> hashSet = new HashSet<Integer>();		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if(intArr[i] == intArr[j]) {
					if(!hashSet.contains(intArr[i])) {
						hashSet.add(intArr[i]);
					}
					break;
				}				
			}
		}		
		for(int m : hashSet) {
			System.out.print(m+",");
		}
		
		//find out more than one number in an array for string
		System.out.println("\ncontains more than one time of string");
		String sentence1 = "Java Program Java Program Java Is a Best Programming Language.";
		sentence1 = sentence1.toLowerCase();
		String[] splitString1 = sentence1.split(" ");	
		HashSet<String> strHashSet = new HashSet<String>();		
		for (int i = 0; i < splitString1.length; i++) {
			for (int j = i+1; j < splitString1.length; j++) {
				if(splitString1[i].equals(splitString1[j])) {
					if(!strHashSet.contains(splitString1[i])) {
						strHashSet.add(splitString1[i]);
					}
					break;
				}				
			}
		}		
		for(String m : strHashSet) {
			System.out.print(m+",");
		}
		
		// calculate compound interest
		System.out.print("Calculate compound interest"+compoundInterestCalc(1000,5,5,1));
		
		
	// close main method	
	}
	
	static boolean isPowerTwo(int n) {
		if(n < 2) return false;
		return (int)Math.ceil(Math.log(n)/Math.log(2)) == (int)Math.floor(Math.log(n)/Math.log(2));
	}
	
	static double compoundInterestCalc(double principle, double rate, int time, int interval) {
		return principle*Math.pow((1+ (rate/100)/interval),(double)(time*interval))-principle;
	}

}
