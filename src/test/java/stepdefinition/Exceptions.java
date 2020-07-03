package stepdefinition;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exceptions {

	public static void main(String[] args) {
		/*
		 * int i=50; int j=0; int data; try { //data=i/j; //may throw exception int
		 * arr[]= {1,3,5,7}; System.out.println(arr[10]); //may throw exception
		 * 
		 * } catch(ArithmeticException e) { System.out.println(e); }
		 * catch(ArrayIndexOutOfBoundsException e) { System.out.println(e);
		 * //System.out.println(i/(j+2)); } catch(Exception e) { System.out.println(e);
		 * } System.out.println("rest of the code");
		 */

		/*
		 * PrintWriter pw; try { pw = new PrintWriter("jtp.txt"); //may throw exception
		 * pw.println("saved"); } catch(FileNotFoundException e) {
		 * System.out.println(e); }
		 * 
		 * System.out.println("File saved successfully");
		 */
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
			System.out.println(a[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
			System.out.println("rest of the code1");
		}
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");

	}

}
