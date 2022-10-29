package packagetwo;

public class ThreadTest {

	public static void main(String[] args) {
		//extends Thread
		ThreadClassTest thread = new ThreadClassTest();
		thread.start();
	    System.out.println("This code is outside of the thread");
	    // Wait for the thread to finish
	    while(thread.isAlive()) {
	    System.out.println("Thread One... thread alive");
	    }
	    //implements runnable
	    ThreadRunable threadRunable = new ThreadRunable();
	    Thread thread2r = new Thread(threadRunable);
	    thread2r.start();
	    System.out.println("This code is outside of the thread");
	    if(thread2r.isAlive()) {
	    	System.out.println("Thread Two...thread alive");
	    }else {
	    	System.out.println("Thread Two...thread not alive");
	    }
	    if(thread.isAlive()) {
	    	System.out.println("Thread One...thread alive 2");
	    }else {
	    	System.out.println("Thread One...thread not alive");
	    }
	    if(thread2r.isAlive()) {
	    	System.out.println("Thread Two...thread alive 2");
	    }else {
	    	System.out.println("Thread Two...thread not alive");
	    }
	}

}
