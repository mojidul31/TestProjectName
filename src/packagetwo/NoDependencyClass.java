package packagetwo;

import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class NoDependencyClass {
	public static void main(String args[])
    {
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    LocalTime myObj1 = LocalTime.now();
	    System.out.println(myObj1);
	    LocalDateTime myObj3 = LocalDateTime.now();
	    System.out.println("Before formatting: " + myObj3);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String formattedDate = myObj3.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    ArrayList<String> cars1 = new ArrayList<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    for (int i = 0; i < cars1.size(); i++) {
	      System.out.println(cars1.get(i));
	    }
	    cars1.set(0, "Opel");
	    System.out.println("After change "+cars1.get(0));
	    cars1.remove(0);
	    for (int i = 0; i < cars1.size(); i++) {
		      System.out.println(cars1.get(i));
		    }
	    
		//found runtime arithmetic exception
		//System.out.println( 42/0 );
		System.out.println("Test Class");
		//test lamda expression
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
		numbers.forEach((n) -> {System.out.println(n);});
		
		//float variable
		float myFloatNum = 5.99f;
		System.out.println(myFloatNum);
		//type casting
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
		double h = 9.55;
		int hi = (int)h; // manual casting: double to int
		System.out.println(hi);
		//Array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		cars[0] = "Opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
		}
		for (String i : cars) {
			  System.out.println(i);
			}
		
		//muti-dymentional array
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
		// add 0 to 10 using recursion
		System.out.println(sum(10));
		
    }
	
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
}
