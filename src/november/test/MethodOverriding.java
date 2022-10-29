package november.test;

public class MethodOverriding extends Vehicle {

	static String color="black";  
	//defining the same method as in the parent class  
	  void run(){
		  System.out.println("Bike is running safely");
	  }  

	public static void main(String[] args) {

		MethodOverriding obj = new MethodOverriding();//creating object  
		obj.run();//calling method 
		Vehicle obj1 = new Vehicle();//creating object  
		obj1.run();//calling method 
		Vehicle obj2 = new MethodOverriding();//creating object  
		obj2.run();//calling method
		
		System.out.println(color);//prints color of Dog class  
		System.out.println(obj2.color);//prints color of Animal class  
	}

}

//Creating a parent class.  
class Vehicle{ 
	String color="white";  
	//defining a method  
	void run(){System.out.println("Vehicle is running");}  
}  
