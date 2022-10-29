package november.test;

public class BindingTest extends Animal21 {

	private void eat(){
		 System.out.println("dog is eating...");
	 }
	
	public static void main(String[] args) {
		//static binding
		BindingTest d1=new BindingTest();  
		d1.eat(); 
		//dynamic binding
		Animal21 a=new BindingTest();  
		a.eatDynamic();
		//use of instanceof
		Animal21 s=new Animal21();  
		System.out.println(s instanceof Animal21);//true
		System.out.println(s instanceof BindingTest);//false 

	}

}

class Animal21{  
	 void eatDynamic(){
		 System.out.println("animal is eating...");
		 }
} 
