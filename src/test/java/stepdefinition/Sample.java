package stepdefinition;

public class Sample extends ExamPreparation{
	
	final static int v;
	static int w=10;
	int x=4;
	
	static
	{
		v=10;
	}
	
 public Sample()
 {
	 super();
	 System.out.println(this);
	 System.out.println(w);
	 System.out.println(x);
 }
 
 public void display()
 {
	 int i = 0;
	 System.out.println("Child class" + i);
 }
 
 public static void main(String[] args) {
	ExamPreparation e=new Sample();
	if(e instanceof Sample)
		{Sample s=(Sample)e;
		s.display();
		}
	
	//System.out.println(x);
	
	
}

}
