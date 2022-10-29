package packagetwo;

import java.util.*;

public class LinkedListVsArrayList {
	public static void main(String[] args) {
	    LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    // Use addFirst() to add the item to the beginning
	    cars.addFirst("Mazda"); // check index it's first
	    System.out.println(cars);
	    
	    ArrayList<String> carArr = new ArrayList<String>();
	    carArr.add("Volvo");
	    carArr.add("BMW");
	    carArr.add("Ford");
	    
	    // Use addFirst() to add the item to the beginning
	    carArr.add("Mazda"); // check index it's not first
	    System.out.println(carArr);
	  }
}
