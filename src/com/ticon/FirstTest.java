package com.ticon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class FirstTest {
	
	public static String convertStringToDigit(String alpha) {
		//String str=" abc d 1234567890pqr 54897";
		Pattern pattern = Pattern.compile("\\w+([0-9]+)\\w+([0-9]+)");
		Matcher matcher = pattern.matcher(alpha);
		for(int i = 0 ; i < matcher.groupCount(); i++) {
		  matcher.find();
		  System.out.println(matcher.group());
		}
		return "";
	}
	//https://stackhowto.com/how-to-extract-numbers-from-an-alphanumeric-string-in-java/
	static String getNbr(String str) 
    { 
		if(str != null && !str.isEmpty()) {
			// Replace each non-numeric number with a space
	        str = str.replaceAll("[^\\d]", ""); 
	        // Remove leading and trailing spaces
	        str = str.trim(); 
	        // Replace consecutive spaces with a single space
	        //str = str.replaceAll(" +", " "); 
	  
	        return str; 
		}else
		{
			return "blank";
		}        
    }
	
	static String getValidRoutingNumber(String routingNumber, int maxLength)
    {         
    	String validRoutingNumber = "";
    	if(routingNumber != null && !routingNumber.isEmpty()) {
    		routingNumber = routingNumber.replaceAll("[^\\d]", ""); 
    		//Remove spaces
    		routingNumber = routingNumber.trim();
    		if(routingNumber.length() == maxLength){
    		    validRoutingNumber = routingNumber;
    		}
    	}
    	return validRoutingNumber;
    }

	public static void main(String[] args) {
		
		String tt = getValidRoutingNumber("%34@78899369", 9);
        System.out.println("Res"+tt);
        
		Integer intCon = Integer.parseInt(getNbr("@134%57)89"));
		System.out.println(intCon);
		System.out.println();
		System.out.println("len "+getNbr("@01234%567)89").length());
		//####################### HashTable ###########################################
		//It is similar to HashMap, but it is synchronized while HashMap is not synchronized.
		//It does not accept null key or value.
		//It does not accept duplicate keys. NB-> Value replace of this key
		//Performance wise HashMap performs in O(log(n)) in comparion to O(n) in Hashtable for most common operations such as get(), put(), contains() etc.
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		hashTable.put("Key1","Value1");
		hashTable.put("Key2","Value2");
		hashTable.put("Key3","Value3");
		hashTable.put("Key3","Value4"); // key3 value replace by Value4
		
		System.out.println(hashTable.size());
		
		Iterator<String> hashTabIterator = hashTable.keySet().iterator();
		while(hashTabIterator.hasNext()) {
			String key = hashTabIterator.next();
			String mappedValue = hashTable.get(key);
			System.out.println("Key: " + key + ", Value: " + mappedValue);
		}
		
		for(var key : hashTable.keySet()) {
			System.out.println(key);
		}
		
		for(var key : hashTable.values()) {
			System.out.println(key);
		}
		
		System.out.println(hashTable.contains("Value2"));
		System.out.println(hashTable.containsValue("Value2"));
		System.out.println(hashTable.containsKey("Key2"));
		System.out.println(hashTable.get("Key2"));
		System.out.println(hashTable.remove("Key3"));
		System.out.println("After remove "+hashTable.size());
		
		Hashtable<String, String> hashTable1 = new Hashtable<String, String>();
		hashTable1.put("Key1","Value1");
		hashTable1.put("Key2","Value2");
		hashTable1.put("Key3","Value3");
		hashTable1.put("Key4", "Value4");
		
		System.out.println("Before Clear "+hashTable1.size());
		
		for(var key : hashTable1.keySet()) {
			System.out.println(key);
		}
		
		for(var key : hashTable1.values()) {
			System.out.println(key);
		}
		
		hashTable1.clear();
		System.out.println("After Clear "+hashTable1.size());		
		System.out.println("After Clear "+hashTable1.isEmpty());
		
		//####################### HashMap ###########################################

		//Java HashMap contains only unique keys.
		//Java HashMap may have one null key and multiple null values.
		//Java HashMap is non synchronized.
		//Java HashMap maintains no order.
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Key1","Value1");
		hashMap.put("Key2","Value2");
		hashMap.put("Key3","Value3");
		hashMap.put("Key4","Value4"); // key3 value replace by Value4
		
		for(Map.Entry m : hashMap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
		System.out.println(hashMap.size());
		System.out.println(hashMap.isEmpty());
		System.out.println("Key Exists "+hashMap.containsKey("Key2"));
		System.out.println("Value Exists "+hashMap.containsValue("Value2"));
		//System.out.println("Equals "+hashMap.equals(hashMap.en));
		
		
		Iterator<String> iterate = hashMap.keySet().iterator();
		while(iterate.hasNext()) {
			String key = iterate.next();
			String mappedValue = hashMap.get(key);
			System.out.println("Key: " + key + ", Value: " + mappedValue);
		}
		
		hashMap.remove("Key2");
		System.out.println("After Remove an item");
		Iterator<String> iterate1 = hashMap.keySet().iterator();
		while(iterate1.hasNext()) {
			String key = iterate1.next();
			String mappedValue = hashMap.get(key);
			System.out.println("Key: " + key + ", Value: " + mappedValue);
		}
		System.out.println("After Replace an item");
		hashMap.replace("Key1","Mojidul");
		Iterator<String> iterate2 = hashMap.keySet().iterator();
		while(iterate2.hasNext()) {
			String key = iterate2.next();
			String mappedValue = hashMap.get(key);
			System.out.println("Key: " + key + ", Value: " + mappedValue);
		}
		
		//####################### Multi-dimensional array ###########################################
		//int[][] mulDimenArr = new int[3][3];
		int[][] mulDimenArr = {
			{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
			};
		for (int i = 0; i < mulDimenArr.length; i++) {
			for (int j = 0; j < mulDimenArr.length; j++) {
				System.out.print(mulDimenArr[i][j]+"\t");
			}
		}
		
		//####################### HashSet ###########################################
		//HashSet is the best approach for search operations.
		//HashSet class is non synchronized.
		//HashSet allows null value.
		//HashSet contains unique elements only.
		//The initial default capacity of HashSet is 16, and the load factor is 0.75.
		String duplicateWordFind = "I am Mojidul Islam. My son Nayeem Islam. I am a senior programmer.";
		String lowercasesentence = duplicateWordFind.toLowerCase();
		String[] spiltSentence = lowercasesentence.split(" ");
		HashSet<String> hash = new HashSet<String>();
		List<String> str = new ArrayList<String>();
		for (int i = 0; i < spiltSentence.length; i++) {
			if(!hash.add(spiltSentence[i])) { //return true or false but added item into list
				str.add(spiltSentence[i]);
			}
		}
		System.out.println("");
		System.out.print(str);
		for(var s : spiltSentence) {
			System.out.print(s+" ");
		}
		System.out.println("Useing Iterator");
		Iterator<String> iterator = hash.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println("");
		System.out.println(hash.contains("is")); // false
		System.out.println(hash.contains("am")); // true
		System.out.println(hash.isEmpty()); // false
		System.out.println(hash.size()); // item count of hash
		//var cloneHashSet = hash.clone();
		//System.out.println(cloneHashSet.size());
		System.out.println(hash.remove("a")); // remove an item
		System.out.println(hash.size()); // after remove item count of hash
	    
		//####################### Get System Variable #########################
		//name and value of all environment variables in Java  program
		System.out.println("===========Get System Variable=============");
	      Map<String, String> env = System.getenv();
	        for (String envName : env.keySet()) {
	            System.out.format("%s=%s%n", envName, env.get(envName));
	        }

	}

}
