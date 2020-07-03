package stepdefinition;

import java.util.Locale;

public class InternString {
	public static void main(String[] args) {
		
	
	
    String s1 = "Javatpoint";  
    String s2 = s1.intern();  
    String s3 = new String("Javatpoint");  
    String s4 = s3.intern();          
    System.out.println(s1==s2); // True  
    System.out.println(s1==s3); // False  
    System.out.println(s1==s4); // True       
    System.out.println(s2==s3); // False  
    System.out.println(s2==s4); // True        
    System.out.println(s3==s4); // False     
    
    System.out.println(s1.codePointAt(3));
    System.out.println(s1.codePointBefore(6));
    System.out.println(s1.codePointCount(4, 8));
    //System.out.println(s1.toLowerCase(Locale.ENGLISH));
    //System.out.println(s1.toLowerCase(Locale.GERMAN));
    //System.out.println(s1.toLowerCase(Locale.forLanguageTag("tr")));
    
    System.out.println(s1);
    s1 = s1.concat("xyz");
    s2=s1;
    System.out.println(s1);
    System.out.println(s2);
    
    String str = "India is my country";  
    System.out.println(str.substring(0, 7) + str.substring(8));  
    
    String s=50+30+"Sachin"+40+40;  
    System.out.println(s);
    
    String a = "Love";  
    String b = "You";  
    System.out.println("Before swap: " + a + " " + b);  
    a = a + b;  
    System.out.println(a);
    b = a.substring(0, a.length() - b.length());  
    System.out.println(b);
    a = a.substring(b.length());  
    System.out.println(a);
    System.out.println("After swap: " + a + " " + b);
	}
}
