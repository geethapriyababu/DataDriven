package stepdefinition;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet();
		Set<Integer> s1=new HashSet();
		LinkedHashSet<Integer> s2=new LinkedHashSet();
		
		
		
		s1.add(45);
		s1.add(62);
		s1.add(89);
		s.add(10);
		s.add(50);
		s.add(40);
		s.add(30);
		s.add(70);
		s.add(18);
		System.out.println(s);
		
		s.addAll(s1);
		System.out.println(s);
		//s1.clear();
		System.out.println(s1);
		System.out.println(s);
		
		System.out.println(s.contains(50));
		
		System.out.println(s.containsAll(s1));
		
		System.out.println(s.equals(s1));
		
		System.out.println(s1.isEmpty());
		
		Iterator<Integer> iterator = s.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println(s.remove(50));
		
		//System.out.println(s.removeAll(s1));
		
		System.out.println(s.retainAll(s1));
		System.out.println(s);
		
		System.out.println(s.size());
		
		
	/*	Spliterator<Integer> spliterator = s.spliterator();
		while(spliterator.hasCharacteristics(0))
			System.out.println(spliterator.characteristics());*/
		
		Object[] array = s.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		
		
	}

}
