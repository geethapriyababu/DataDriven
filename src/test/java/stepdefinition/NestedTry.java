package stepdefinition;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
				
			} 
			
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			finally 
			{
				System.out.println("finally block 3");
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}
			finally 
			{
				System.out.println("finally block 2");
			}

			System.out.println("other statement");
		} 
		catch (Exception e) 
		{
			System.out.println("handeled");
		} 
		finally 
		{
			System.out.println("finally block 1");
		}
		System.out.println("normal flow..");

	}

}
