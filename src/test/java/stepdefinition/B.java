package stepdefinition;

public class B implements I {
	ThisKeyword1 obj;
	public B(ThisKeyword1 obj)
	{
		System.out.println("constructor execution");
		System.out.println(obj);
		this.obj=obj;
	}
	
	public B()
	{
		System.out.println("constructor execution");
	}
	
	public void b() {
System.out.println("B method");	}
	
	 void display(){  
		    System.out.println(obj.data);//using data member of A4 class  
		    obj.someting();
		  }

}
