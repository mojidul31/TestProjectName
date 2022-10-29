package november.test;

//Programmer is an Employee == inheritance IS-A relationship
public class Programmer extends Employee {

	int bonus=10000;  
	public static void main(String[] args) {
		Programmer p=new Programmer();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);  
	}

}

class Employee{  
	 float salary=40000;  
} 
