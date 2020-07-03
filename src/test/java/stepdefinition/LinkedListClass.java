package stepdefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList();

		LinkedList<String> l1 = new LinkedList();
		LinkedList<Integer> ll = new LinkedList();
		ll.add(1);
		ll.add(5);
		ll.add(9);
		ll.add(54);
		ll.add(41);
		
		String a[]= {"Super","Good","Nice","Good"};

		l.add("I");
		l.add("love");
		l.add("my");
		l.add("my");
		l.add("small");
		
		l.add("India");
		l.add(null);

		System.out.println(l);

		l.addFirst("Ram");
		l.addLast("country");
		

		System.out.println(l);

		Iterator<String> descendingIterator = l.descendingIterator();
		while (descendingIterator.hasNext())
			System.out.println(descendingIterator.next());

		System.out.println(l.element());

		System.out.println(l.get(4));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.indexOf("my"));
		System.out.println(l.isEmpty());
		System.out.println(l.lastIndexOf("my"));
		System.out.println(l.offer("asia"));
		System.out.println(l.offerFirst("dev"));
		System.out.println(l.offerLast("europe"));
		System.out.println(l);

		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l);
		System.out.println(l.pop());

		System.out.println(l);

		l.push("I");
		System.out.println(l);
		l.remove(5);
		System.out.println(l);
		l.removeFirstOccurrence("my");
		System.out.println(l);
		l.set(4, "Europe");
		System.out.println(l);
		System.out.println(l.size());

		//l.retainAll(l1);
		//System.out.println(l);
		
		
		
		ListIterator<String> iterator = l.listIterator(3);
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

		while (iterator.hasNext()) {
			iterator.next();
			System.out.println(iterator.nextIndex());

		}

		while (iterator.hasPrevious()) {
			System.out.println(iterator.previousIndex());
			iterator.previous();
		}
		
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println(Collections.max(l));
		
		System.out.println(Collections.min(l));

		
		
		Collections.addAll(l1,a);
		System.out.println(l1);
		
		Collections.copy(l, l1);
		System.out.println(l);
		
		Collection<String> checkedCollection = Collections.checkedCollection(l,String.class);
		System.out.println("type safe view-" +checkedCollection);
		
		List<Integer> checkedList = Collections.checkedList(ll, Integer.class);
		System.out.println("type safe view for integer -" +checkedList);
		
		System.out.println(Collections.disjoint(l, l1));
		
		Iterator<Object> emptyIterator = Collections.emptyIterator();
		System.out.println(emptyIterator.hasNext());
		
		Collections.fill(ll, 50);
		System.out.println(ll);
		
		int frequency = Collections.frequency(l1, "Good");
		System.out.println(frequency);
		
		System.out.println(Collections.indexOfSubList(l,l1));
		
		System.out.println(Collections.lastIndexOfSubList(l, l1));
		
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println(Collections.max(l));
		
		System.out.println(Collections.min(l));
		
		Collections.replaceAll(l1, "Good", "Bad");
		System.out.println(l1);
		
		Collections.reverse(l);
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		Comparator<Object> reverseOrder = Collections.reverseOrder(null);
		Collections.sort(l,reverseOrder);
		System.out.println(l);
		
		Collections.rotate(l, 3);
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);
		
		Collections.shuffle(l, new Random(5));
		System.out.println(l);
		
		Set<LinkedList<String>> singleton = Collections.singleton(l);
		System.out.println(singleton);
		
		Collections.swap(l, 2, 5);
		System.out.println(l);
		
		
		
		//Collections.checkedCollection(c, type)
	}

}
