package stepdefinition;

 class Java {
	 
	 static final int data;//static blank final variable  
	  static
	  { data=50;
	  }

strictfp static public void main(String... args) {
	System.out.println("A simple java program");
	char c1='2';
	System.out.println(c1);
	//Unary operator
	
	/*int x=10;  
	System.out.println(x++);//10 (11)  
	System.out.println(++x);//12  
	System.out.println(x--);//12 (11)  
	System.out.println(--x);//10  
*/
	/*int a=10;  
	int b=-10;  
	boolean c=true;  
	boolean d=false;  
	System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
	System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
	System.out.println(!c);//false (opposite of boolean value)  
	System.out.println(!d);//true  
	*/
	
//	Arthimetic operators
	
	/*int a=10;  
	int b=5;  
	System.out.println(a+b);//15  
	System.out.println(a-b);//5  
	System.out.println(a*b);//50  
	System.out.println(a/b);//2  divide takes quotient
	System.out.println(a%b);//0  modulo takes reminder
	*/
	
//	Left shift operator
	
	//<<
	
//	System.out.println(10<<2);//10*2^2=10*4=40  

//Right shift operator
	
	//>>
	
	//System.out.println(20>>3);//20/2^3=20/8=2 
	
	//Java shift operators
	
	//>>,>>>
	
    /*System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  
    System.out.println(-20>>>2);  
*/

	//bitwise and logical opertaors
	
	
	/*int a=10;  
	int b=5;  
	int c=20;  
	System.out.println(a<b&&a++<c);//false && true = false  
	System.out.println(a);//10 because second condition is not checked  
	System.out.println(a<b&a++<c);//false && true = false  
	System.out.println(a);//11 because second condition is checked  
	
	
	System.out.println(a>b||a<c);//true || true = true  
	System.out.println(a>b|a<c);//true | true = true  
	//|| vs |  
	System.out.println(a>b||a++<c);//true || true = true  
	System.out.println(a);//10 because second condition is not checked  
	System.out.println(a>b|a++<c);//true | true = true  
	System.out.println(a);//11 because second condition is checked  
*/	
//	Ternary operator
	
/*	int a=2;  
	int b=5;  
	int min=(a<b)?a:b;  
	System.out.println(min);  
*/
	
//	Assignment Operator
	
	/*int a=10;  
	a+=3;//10+3  
	System.out.println(a);  
	a-=4;//13-4  
	System.out.println(a);  
	a*=2;//9*2  
	System.out.println(a);  
	a/=2;//18/2  
	System.out.println(a);  
*/
	
//final keyword final final final final final final final final final final final final final final final fianl final
	
	    
	 
	    System.out.println(Java.data);  
	   

	

	
	}

};

//strictfp is a non-access modifier which is used to show the floating point calculations and ensure same result on every platform
//This strictfp keyword is used for class, abstract class, methods and interfaces but not for abstract methods.also cannot be used
//for methods which is abstract by default declared inside the interfaces.