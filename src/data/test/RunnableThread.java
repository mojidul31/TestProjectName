package data.test;

import java.util.ArrayList;
import java.util.HashSet;

public class RunnableThread implements Runnable {

	@Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		
		HashSet<Integer> list2 = new HashSet<Integer>();
		list2.add(3);
		list2.add(3);
		
		System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new RunnableThread();

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);
        
        thread.sleep(10000);

        System.out.println("Starting Thread...");
        thread.start();
	}
}
