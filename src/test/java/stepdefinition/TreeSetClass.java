package stepdefinition;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet<String> s3 = new TreeSet();
		TreeSet<String> s4 = new TreeSet();
		s3.add("Hi");
		s3.add("Ram");
		s3.add("Am");
		s3.add("geetha");
		s3.add("here");
		s3.add("how");
		s3.add("are");
		s3.add("aare");
		// s3.add(null);
		
		s4.add("you");
		s4.add("good");
		s4.add("are");
		
		System.out.println(s4);

		Iterator<String> i = s3.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
		s3.addAll(s4);
		System.out.println(s3);
		
		System.out.println(s3.ceiling("are"));
		Object clone = s3.clone();
		System.out.println(clone);
		
		s3.comparator();
		System.out.println(s3);
		
		System.out.println(s3.contains("geetha"));
		
		System.out.println(s3.containsAll(s4));
		
		Iterator<String> d = s3.descendingIterator();
		while(d.hasNext())
			System.out.println(d.next());
		
		NavigableSet<String> set = s3.descendingSet();
		for (String string : set) {
			System.out.println(string);
			
		}
		
		
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.first());
		System.out.println(s3.floor("are"));
		System.out.println(s3.headSet("geetha"));
		System.out.println(s3.isEmpty());
		System.out.println(s3.last());
		System.out.println(s3.lower("here"));
		System.out.println(s3.higher("here"));
		System.out.println(s3.pollFirst());
		System.out.println(s3.pollLast());
		System.out.println(s3.remove("aare"));
		System.out.println(s3);
		//System.out.println(s3.retainAll(s4));
		System.out.println(s3);
		
		System.out.println(s3.size());
		
		Spliterator<String> spliterator = s3.spliterator();
		
		SortedSet<String> subSet = s3.subSet("Ram", "here");
		System.out.println(subSet);
		
		NavigableSet<String> subSet2 = s3.subSet("Ram",true ,"here",true);
		System.out.println(subSet2);
		
		SortedSet<String> tailSet = s3.tailSet("good");
		System.out.println(tailSet);
		
		NavigableSet<String> tailSet2 = s3.tailSet("here", false);
		System.out.println(tailSet2);
		
		Object[] array = s3.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		
		Comparator<? super String> comparator = s3.comparator();
		System.out.println(comparator);
		
		Set<String> checkedSet = Collections.checkedSet(s3, String.class);
		System.out.println("type safe view of set-"+checkedSet);
		
		NavigableSet<String> checkedNavigableSet = Collections.checkedNavigableSet(subSet2, String.class);
		System.out.println("type safe view set-"+checkedNavigableSet);
		
		

		//System.out.println(s3);
		
		//System.out.println(s3.descendingSet());
		//System.out.println(s3);
		}

}
