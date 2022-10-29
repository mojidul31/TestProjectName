package november.test;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class FirstTest {
	
	public static void main(String args[]) {
		System.out.println("First Test");
		//using unary operator
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10
		
		//use of Scanner
		//Scanner input = new Scanner(System.in);
		//double dv = input.nextDouble();
		//System.out.println(dv);
		
		//left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240 
		
		//right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2 
		
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	    
	    // && operator doesn't check the second condition if the first condition is false but & check always both condition
	    int a=10;  
	    int b=5;  
	    int c=20;  
	    System.out.println(a<b&&a++<c);//false && true = false  
	    System.out.println(a);//10 because second condition is not checked  
	    System.out.println(a<b&a++<c);//false && true = false  
	    System.out.println(a);//11 because second condition is checked
	    
	    //logical || operator doesn't check the second condition if the first condition is true. but bitwise | operator always checks both conditions
	    System.out.println(a>b||a++<c);//true || true = true  
	    System.out.println(a);//10 because second condition is not checked  
	    System.out.println(a>b|a++<c);//true | true = true  
	    System.out.println(a);//11 because second condition is checked  
	    
	    //Java Assignment Operator
	    a+=3;//10+3  
	    System.out.println(a);  
	    a-=4;//13-4  
	    System.out.println(a);  
	    a*=2;//9*2  
	    System.out.println(a);  
	    a/=2;//18/2  
	    System.out.println(a);
	    
	    short xx=10;  
	    short xy=10;  
	    //a+=b;//a=a+b internally so fine  
	    //xx=xx+xy;//Compile time error because 10+10=20 now int 
	    xx=(short)(xx+xy);//20 which is int now converted to short  
	    System.out.println(xx); 
	    
	    //find the count of each number
	    int[] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
	    HashSet<Integer> hash = new HashSet<Integer>();
	    for (int i = 0; i < arr.length; i++) {	    	
			for(int j = i+1; j<arr.length; j++) {
				hash.add(arr[i]);
			}			
		}
	    for (int ii : hash) {
	    	int count = 0;
	    	for (int j = 0; j < arr.length; j++) {
				if(ii == arr[j]) {
					count++;
				}
			}
	    	 System.out.println("Key=> "+ii + "Count => "+count);
		}
	   
	    
	    //reverse of an array
	    int[] arr1 = new int [] {1, 2, 3, 4, 5};
	    int[] arr2 = new int [arr1.length];
	    int j= 0;
	    for (int i = arr1.length-1; i >= 0; i--) {
			arr2[j] = arr1[i];
			j+=1;
		}
	    for(int jj : arr2) {
	    	System.out.println("p => "+jj);
	    }
	    
	    //find the even position
	    for (int i = 1; i < arr1.length; i++) {
			if(i%2 == 0) {
				System.out.println("Even => "+arr1[i]);
			}
		}
	    
	    //find the largest element
	    int temp = 0;
	    int arr3[]={1,2,5,6,3,2};  
	    for (int i = 0; i < arr3.length; i++) {
			for(int p =i+1; p < arr3.length; p++) {
				if(arr3[i] > arr3[p]) {
					temp = arr3[i];  
                    arr3[i] = arr3[j];  
                    arr3[j] = temp;  
				}
			}
		}
	    for (int i = 0; i < arr3.length; i++) {
	    	System.out.println("item => "+arr3[i]);
		}
	    System.out.println("Max => "+temp);
	    //second largest number
	    System.out.println("Second => "+arr3[arr3.length - 2]);
	    //third largest number
	    System.out.println("Third => "+arr3[arr3.length - 3]);
	    
	    //string test
	    //find total no. of character
	    String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
	    int strCount = 0;
	    for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				strCount++;
			}
		}
	    System.out.println("Total Char => "+strCount);
	    
	    int strCount1=0;
	    for (int i = 0; i < str.length(); i++)   
	    {    
	    //Checks whether given character is punctuation mark    
	    if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
	    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
	    {    
	    	strCount1++;    
	    }    
	    }    
	    System.out.println("The number of punctuations exists in the string is: " +strCount1);   
	    
	    //find out vowel and consonants
	    String strAlpha = "abcdefghijklmnopqrstuvwxyz";
	    for (int i = 0; i < strAlpha.length(); i++) {
			if(strAlpha.charAt(i) == 'a' | strAlpha.charAt(i) == 'e' | strAlpha.charAt(i) == 'i' | strAlpha.charAt(i) == 'o' | strAlpha.charAt(i) == 'u') {
				 System.out.println("Vowel : " +strAlpha.charAt(i));
			}
		}
	    
	    //find anagram( Two string has same character )
	    String str1="Brag";  
        String str2="Grab"; 
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()) {
        	System.out.println("Which is not anagram");
        }else {
        	char[] chArr1 = str1.toCharArray();
        	char[] chArr2 = str2.toCharArray();
        	
        	//Sorting the arrays using in-built function sort ()
        	Arrays.sort(chArr1);
        	Arrays.sort(chArr2);
        	
        	//Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(chArr1, chArr2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        	
        }
        
        String subStr = "I am from Bangladesh";
        System.out.println("subStr "+ subStr.substring(10,20)); 
        System.out.println("subStr$"+ subStr.substring(5,9)+"$");
        var astr = subStr.split(" ");
        for(var ii : astr) {
        	System.out.println("part "+ ii); 
        }
        //Removes the white spaces using regex    
        String newStr1 = subStr.replaceAll("\\s+", "");
        System.out.println("String after removing all the white spaces : " + newStr1);
        
        String newStr2="";        
        for(char ch : subStr.toCharArray()) {
        	if(ch == ' ') {
        		newStr2 += Character.toString(ch);
        	}else {
        		if(Character.isLowerCase(ch)) {
        			char chag = Character.toUpperCase(ch);
        			newStr2 += Character.toString(chag);
            	}else {
            		char chag = Character.toLowerCase(ch);
            		newStr2 += Character.toString(chag);
            	}
        	}        	
        }
        System.out.println("Lower to Upper and Upper to Lower : " + newStr2);
	    
	    
	}

}
