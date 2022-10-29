package com.cyberjahan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		//ExecutorService executorService = Executors.newFixedThreadPool(10);
		ExecutorService executorService = Executors.newSingleThreadExecutor();  
        //executorService.execute(new Runnable() { 
		executorService.submit(new Runnable() {  
              
            @Override  
            public void run() {  
                System.out.println("ExecutorService");  
                  
            }  
        });  
        executorService.shutdown();  

	}

}
