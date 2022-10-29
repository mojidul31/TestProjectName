package fable.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicTest {
	static int vari = 9; // static varible
	int insideInstance;

	public static void main(String[] args) {
		vari = 23;
		System.out.println("static variable "+vari);
		int inside = 100; // local variable
		System.out.println("inside is a local variable "+inside);
		BasicTest obj = new BasicTest();
		obj.insideInstance = 344;
		System.out.println("insideInstance is a instance variable "+obj.insideInstance);
		Dog d=new Dog();  
		d.printColor();
		
		// regular expression
		//1st way  
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		Matcher nm = p.matcher("aaaa");
		boolean b = m.matches();
		boolean bnm = nm.matches();
		System.out.println("Maches "+b);
		System.out.println("NotMaches "+bnm);
		
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		System.out.println("2nd Maches "+b2);
		
		//3rd way  
		boolean b3 = Pattern.matches(".ss", "ass");  
		System.out.println("3rd Maches "+b3);
		
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once) 
		
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		  
	}

}

class Animal{  
	String color="white";  
}  
class Dog extends Animal{  
	String color="black";  
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println("Using super=>"+super.color);//prints color of Animal class //super refer immediate parent class object 
	}  
}  