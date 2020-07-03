package stepdefinition;

public class ThisKeyword extends ThisKeyword1{

	/*ThisKeyword getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {
		new ThisKeyword().getA().msg();

	}
*/
	public ThisKeyword()
	{
		//super();
		System.out.println("child constructor execution");
		this.rollno=0;
		this.name="something";
		this.fee=5.2f;
		
	}
	int rollno;  
	String name;  
	float fee;  
	ThisKeyword(int r,String n,float f){  
	this.rollno=r;  
	this.name=n;  
	this.fee=f;
		
		/*rollno=rollno;  
		name=name;  
		fee=fee;*/
		
		/*rollno=r;  
		name=n;  
		fee=f;
		*/
		
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	
	  
	  
	public static void main(String args[]){  
		ThisKeyword s=new ThisKeyword();
		ThisKeyword s1=new ThisKeyword(111,"ankit",5000f);  
		//ThisKeyword s2=new ThisKeyword(112,"sumit",6000f);  
	s1.display();  
	//s2.display();  
	} 

}
