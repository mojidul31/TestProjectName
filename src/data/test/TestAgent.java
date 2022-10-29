package data.test;

public class TestAgent {

	
	public static String capitaliseFirstLetter (String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
            
        char[] chars = s.toCharArray();
        
        chars[0] = Character.toUpperCase(chars[0]);
        
        return String.valueOf(chars);
    }  
	
	public static String getUserName(String firstName, String lastName) {
	   String name = "";
	   name += capitaliseFirstLetter(firstName);
	   if(lastName != null && !lastName.isEmpty()) {
		   name += ", "+capitaliseFirstLetter(lastName);
	   }
       return name;
    }

	public static void main(String[] args) {
		double dat = 0;
		Double[] darr = {100.43d, null, 120.65d};
		for(int i=0; i<darr.length; i++) {
			if((Double)darr[i] != null) {
				dat += darr[i].doubleValue();
			}else {
				System.out.println("Null show "+(Double)darr[i]);
			}
		}		
//		for(Double d : darr){			
//			//if(!d.equals(null)) {
//			if((Double)d != null) {
//				dat += d.doubleValue();
//			}
//		}
		System.out.print("Result"+dat);
		System.out.println("");
		System.out.println(getUserName("FirstName", "LastName"));
		System.out.println(getUserName("John", "Smith"));
		System.out.println(getUserName("Mark", "O'Reilly"));
		System.out.println(getUserName("FirstName", ""));
	}
	
	
	
	    
	    
	    
	    
	    
}
