package november.test;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Animal11 a;  
		a=new Dog11();  
		a.eat();  
		a=new Cat11();  
		a.eat();  
		a=new Lion11();  
		a.eat();  

	}

}

class Animal11{  
	void eat(){System.out.println("eating...");}  
}  
class Dog11 extends Animal11{  
	void eat(){System.out.println("eating bread...");}  
}  
class Cat11 extends Animal11{  
	void eat(){System.out.println("eating rat...");}  
}  
class Lion11 extends Animal11{  
	void eat(){System.out.println("eating meat...");}  
}  