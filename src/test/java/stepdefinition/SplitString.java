package stepdefinition;

public class SplitString {
	public static void main(String[] args) {
		String s1="welcome to split world";  
		System.out.println("returning words1:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("returning words2:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		}  
		System.out.println("returning words3:");  
		for(String w:s1.split("\\s",4)){  
		System.out.println(w);  
		}  

	}

}
