package november.test;

public class AbstractTest {

	public static void main(String[] args) {
		Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();
		Shape s1=new Rectangle();//In a real scenario, object is provided through method, e.g., getShape() method  
		s1.draw();
	}

}

abstract class Shape{  
	abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
	void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
	void draw(){System.out.println("drawing circle");}  
}  