package packagetwo;

//Interface
interface Animalwq {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pigwq implements Animalwq {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
	 // The body of sleep() is provided here
	 System.out.println("Zzz");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		Pigwq myPig = new Pigwq();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
}
