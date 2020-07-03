package stepdefinition;

public class InstanceInitializerBlock {
	int s;
	{s=100;}
	public InstanceInitializerBlock()
	{
		System.out.println("construtor" + s);
	}
	
	public void msg()
	{
		System.out.println("InstanceInitializerBlock example");
	}
	
	{System.out.println("initialiser block is invoked");}
	
	public static void main(String[] args) {
		InstanceInitializerBlock i=new InstanceInitializerBlock();
		i.msg();
		InstanceInitializerBlock i1=new InstanceInitializerBlock();
		i1.msg();
		
		Object obj = "Geetha";
		System.out.println(obj.hashCode());
		
	}

}
