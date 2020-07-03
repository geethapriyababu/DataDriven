package stepdefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExamPreparation implements Cloneable {
	
    public ExamPreparation()
	{
		System.out.println("Parent class");
	}
	
	int i=12;
	public static void main(String[] args) throws CloneNotSupportedException {
		ExamPreparation ep=new ExamPreparation();
		ExamPreparation ep1 = (ExamPreparation) ep.clone();
		System.out.println(ep.i);
		System.out.println(ep1.i);
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		
		Map<String, String> m=new HashMap();
		m.put("A", "apple");
		m.put("B","Ball");
		m.put("C", "Cat");
		m.put("D", "Dog");
		m.put("E", "Elephant");
		System.out.println(m);
		Set<Entry<String,String>> s=m.entrySet();
		for (Entry<String, String> entry : s) {
			System.out.println(entry.getValue());
		}
		
		List<Entry<String,String>> l=new ArrayList(s);
		for (Entry<String, String> entry2 : s) {
			System.out.println(entry2.getValue());
		}
		
		List<String> l1=new ArrayList<String>();
		l1.add("ABC");
		l1.add("DEF");
		l1.add("GHI");
		l1.add("JKL");
		l1.add("MNO");
		System.out.println(l1);	
	}

}
