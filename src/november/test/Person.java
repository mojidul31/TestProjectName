package november.test;

//Person has an address == Aggregation HAS-A relationship
public class Person {

	int id;  
	String name;  
	Address address;  
	  
	public Person(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		  
		Person e=new Person(111,"varun",address1);  
		Person e2=new Person(112,"arun",address2);  
		      
		e.display();  
		e2.display();  

	}

}

class Address{
	
	String city,state,country;
	  
	public Address(String city, String state, String country) {  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
}
