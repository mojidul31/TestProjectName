package november.test;

public class ProtectedTest extends Ayy {

	public static void main(String[] args) {
		ProtectedTest obj = new ProtectedTest();  
		   obj.msg();
	}

}

class Ayy{  
	protected void msg(){System.out.println("Access protected method");}  
} 
