package november.test;

public class SuperKey {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.printColor();

	}

}


class Animal{  
	String color="white";  
}  
class Dog extends Animal{  
	String color="black";  
	void printColor(){  
		System.out.println("Call Local=> "+color);//prints color of Dog class  
		System.out.println("Call Super=> "+super.color);//prints color of Animal class  
	}  
}  