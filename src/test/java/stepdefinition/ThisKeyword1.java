package stepdefinition;

public class ThisKeyword1 {

	
	/*int rollno;
	String name, course;
	float fee;

	ThisKeyword1(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	ThisKeyword1(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}

	public static void main(String args[]) {
		ThisKeyword1 s1 = new ThisKeyword1(111, "ankit", "java");
		ThisKeyword1 s2 = new ThisKeyword1(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
*/ 
	public ThisKeyword1() {
		// TODO Auto-generated constructor stub
	}
	
 void someting() {
		// TODO Auto-generated method stub
System.out.println("with default modifier");
	}
	  
	  int data=10;  
	  ThisKeyword1(int data)
	  {  
	
	   B b=new B(this);  
	  // System.out.println(data);
	   //int u=data;
	   b.display();  
	  }  
	  public static void main(String args[]){  
		  ThisKeyword1 a=new ThisKeyword1(300);  
	  }  

}
