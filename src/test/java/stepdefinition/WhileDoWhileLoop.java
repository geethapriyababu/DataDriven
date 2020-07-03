package stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileDoWhileLoop {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*int i=1;
		do
		{
			System.out.println(i);
			//i++;
		}while(true);
	*/
		
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	           //using break statement  
	           i++;  
	           System.out.println("inside if condition-"+i);
	           break;//it will break the loop  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10); 
	    
	   

	}
}
