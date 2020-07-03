package stepdefinition;

public class PrivateModifier {
	
	//Declaring constructor as private and trying to create the instance outside the class
	/*String msg;
	
	private PrivateModifier()
	{
		System.out.println("This is private constructor");
		this.msg=msg;
	}
	
	void display()
	{
		System.out.println(msg);
	}

	public static void main(String[] args) {
		PrivateModifier p=new PrivateModifier();
		p.display();
	}*/
	
	private void display()
	{
		System.out.println("Invoking private method outside the class");
	}
}
