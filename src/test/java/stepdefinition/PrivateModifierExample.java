package stepdefinition;

import java.lang.reflect.Method;

public class PrivateModifierExample {
	
	public static void main(String[] args) throws Exception {
		
		/*PrivateModifier pm=new PrivateModifier();
		pm.display();*/
		
		Class c=Class.forName("PrivateModifier");
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("display",null);
		m.setAccessible(true);
		m.invoke(o,null);
	}
}
