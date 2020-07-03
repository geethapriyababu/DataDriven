package stepdefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class ArrayListClass
{
	
	public static void main(String[] args) {
		List<String> l=new ArrayList();
		List<String> l1=new LinkedList();
		
		l.add("abc");
		l.add("abc");
		l.add("xyz");
		l.add("lkj");
		
		
		l.add(1, "you");
		System.out.println(l);

		l1.add("i");
		l1.add("love");
		l1.add("India");
		l1.add(null);
		l.addAll(l1);
		
		System.out.println(l);
		
		l.addAll(3, l1);
		
		System.out.println(l);
		
		l.clear();
		
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		
		System.out.println(l1.contains("India"));
		
		l.add("abc");
		l.add("abc");
		l.add("xyz");
		l.add("lkj");
		
		l.add(1, "you");
		l.addAll(l1);
		
		System.out.println(l.containsAll(l1));
		
		System.out.println(l1.equals(l));
		
		System.out.println(l1.get(2));
		
		System.out.println(l1.getClass());
		
		System.out.println(l.indexOf("you"));
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println(l.lastIndexOf("abc"));
		ListIterator<String> iterator2 = l.listIterator();
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
			
		ListIterator<String> iterator3 = l.listIterator(5);
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next());
		}
		
		l.remove(1);
		System.out.println(l);
		
		l.remove("lkj");
		System.out.println(l);
		
		l.removeAll(l1);
		System.out.println(l);
		
	//	Predicate<String> n;	
		//l.removeIf(n -> (n.charAt(0)=='a'));
		
		//l.retainAll(l1);
		//System.out.println(l);
		
		
		
		l.set(0, "I");
		System.out.println(l);
		
		System.out.println(l.size());
		
		List<String> subList = l.subList(0,2);
		System.out.println(subList);
		System.out.println(l);
		
		Object[] array = l.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		List<Object> asList = Arrays.asList(array);
		System.out.println(asList);
		
		Collections.reverse(l1);
		System.out.println(l1);
		
		/*List<String> unmodifiableList = Collections.unmodifiableList(l);
		unmodifiableList.add("nation");
		System.out.println(unmodifiableList);*/
		
		
		l.add("I");
		System.out.println(Collections.frequency(l, "I"));
		
		
		
		
		
	}

}
