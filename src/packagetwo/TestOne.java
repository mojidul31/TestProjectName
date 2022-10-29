package packagetwo;

import packageone.ClassOne;

public class TestOne {
	int id;  
	String name;  
	  
	void display(){
		System.out.println(id+" "+name);
	}
	
	public static void main(String args[])
    {
		//divided by zero
		System.out.println( 42/0 );
        ClassOne obj = new ClassOne();
        obj.display();
        //if value not initialize
        TestOne s1=new TestOne();  
        TestOne s2=new TestOne();  
        s1.display();  
        s2.display();
        //type casting
        int k1=5;
        byte b;
        //b= k1; // cannot convert from int to byte
        b= (byte)k1;
        System.out.println("type casting int to byte= "+b);
        int k2;
        k2=b;
        System.out.println("assign byte to int = "+k2);
        //array
        //int[] intArr = new int[]; // shows error
        int[] intArr = new int[5];
        intArr[0] = 5;
        System.out.println("Array [0] value="+intArr[0]);
        //Two dimensional array test
        int twoD[][] = new int[4][4];
        int ii,jj,kk=0;
        for(ii=0;ii<4;ii++) {
        	for(jj=0;jj<4;jj++) {
        		twoD[ii][jj]=++kk;
        	}
        }
        for(ii=0;ii<4;ii++) {
        	for(jj=0;jj<4;jj++) {
        		System.out.print(twoD[ii][jj]+"\t");
        	}
        	System.out.println();
        }
        // break        
        for(int jjj=0;jjj<4;jjj++) {        	
    		if(jjj ==2)
    			break; 
    		System.out.println("break check = "+jjj);
    	}
       //continue        
        for(int jjj=0;jjj<4;jjj++) {        	
    		if(jjj ==2)
    			continue; 
    		System.out.println("continue check = "+jjj);
    	}
        //recursion method
        int fact1 = factotialValue(3);
        System.out.println("Factorial = "+fact1);
    }
	static int factotialValue(int n) {
    	int result;
    	
    	if(n < 1 || n==1) return 1;
    	result = factotialValue(n-1)*n;
    	return result;
    }
	
}
