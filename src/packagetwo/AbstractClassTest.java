package packagetwo;

abstract class AnimalAbs {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class PigAbs extends AnimalAbs {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
	
class AbstractClassTest {
	public static void main(String[] args) {
	    PigAbs myPig = new PigAbs(); // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
}


