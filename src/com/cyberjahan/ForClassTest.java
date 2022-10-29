package com.cyberjahan;

import java.lang.reflect.Method;

class TestA{
	
	private void show(){
		System.out.println("This is private method");
	}
}

public class ForClassTest {

	public static void main(String[] args) throws Exception{
		 // test for known to me
        Class c=Class.forName("com.cyberjahan.TestA");        
        System.out.println("Class Name=>"+c.getName());
        
        TestA obj = (TestA)c.newInstance();
        
        //how to access private method using reflection
        Method m = c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        m.invoke(obj);
        
        

	}

}


