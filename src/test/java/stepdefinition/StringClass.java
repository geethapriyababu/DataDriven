package stepdefinition;

public class StringClass {
	public static void main(String[] args) {
		
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);  
		
		String s1="javatpoint";  
		System.out.println(s1.substring(0,1));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint
		
        String str = "Hello Javatpoint readers";  
        boolean isContains = str.contains("Javatpoint");  
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(str.contains("javatpoint")); // false  

        String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time);  
        
        String s3="";    
        String s4="Javatpoint";             
        // Either length is zero or isEmpty is true  
        if(s3.length()==0 || s3.isEmpty())  
            System.out.println("String s1 is empty");  
        else System.out.println("s1");        
        if(s4.length()==0 || s4.isEmpty())  
            System.out.println("String s2 is empty");  
        else System.out.println(s4);  
        
        String[] split = str.split(" ");
        for (String string : split) {
			System.out.println("splitted string"+string);
		}
       

        
	}

}
