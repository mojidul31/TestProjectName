package november.test;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// queue test FIFO
		Queue<Integer> qu = new PriorityQueue<Integer>();
		 //Adding Books to the queue  
		qu.add(11);  
		qu.add(12);  
		qu.add(13);
		System.out.println(qu);
		for(int i : qu) {
			System.out.println(i);
		}

		// stack test LIFO
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(31);
		stk.push(34);
		stk.push(32);
		System.out.println(stk);
		for(int i : stk) {
			System.out.println(i);
		}
		
		//Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet();  
       set.add("One");    
       set.add("Two");    
       set.add("Three");   
       set.add("Four");  
       set.add("Five");  
       Iterator<String> i=set.iterator();  
       while(i.hasNext())  
       {  
       System.out.println(i.next());  
       }
       
       //arrayLIst
       ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
       list.add("Mango");//Adding object in arraylist    
       list.add("Apple");    
       list.add("Banana");    
       list.add("Grapes");    
       //Printing the arraylist object   
       System.out.println(list); 
       
       //linkedList
       LinkedList<String> al=new LinkedList<String>();  
       al.add("Ravi");  
       al.add("Vijay");  
       al.add("Ravi");  
       al.add("Ajay");  
       
       Iterator<String> itr=al.iterator();  
       while(itr.hasNext()){  
        System.out.println(itr.next());  
       }  
	}

}
