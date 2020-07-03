package stepdefinition;

public class StaticClass {
	
	int count=0;//will get memory each time when the instance is created  
	//static int count=0;  will allocate memory only once during the class is loading
	
	StaticClass(){  
	count++;//incrementing value  
	System.out.println(count); 
	}
	
	public static void main(String args[]){  
		//Creating objects  
		StaticClass c1=new StaticClass();  
		StaticClass c2=new StaticClass();  
		StaticClass c3=new StaticClass();  
		}  


}
