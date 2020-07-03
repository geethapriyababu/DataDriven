package stepdefinition;

public class ThrowKeyword {
	public static void main(String[] args) {
	      validate(13);  
	      System.out.println("rest of the code...");  

	}

	   static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	

}
