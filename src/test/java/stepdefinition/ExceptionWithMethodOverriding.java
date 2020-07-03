package stepdefinition;

import java.io.FileNotFoundException;

public class ExceptionWithMethodOverriding extends ParentExceptions {
	
	
	void msg() throws ArithmeticException,NullPointerException
	{
		System.out.println("child class");
		throw new NumberFormatException();
	}

	public static void main(String[] args) {
ParentExceptions p=new ExceptionWithMethodOverriding();
try {
	p.msg();
}
catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("numberformat exception bloock");
}
catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
