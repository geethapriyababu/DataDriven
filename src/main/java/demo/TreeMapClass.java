package demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		
			TreeMap<Integer,String> lhm=new TreeMap<Integer,String>(); 
		   
		   	lhm.put(1, "Ball");
			lhm.put(2, "Doll");
			lhm.put(3, "Helicopter");
			lhm.put(3, "Bat");
			lhm.put(4, "Super");
			lhm.put(5, null);
			lhm.put(4,null);
			lhm.put(6, "Monkey");
			lhm.put(7, "Super");
			lhm.put(9, "Ball");
			
			TreeMap<Integer,String> lhm1=new TreeMap<Integer,String>(); 
			
			lhm1.put(5, "Pencil");
			lhm1.put(6, "Cucumber");
			lhm1.put(4, "Garlic");
			
			
			System.out.println(lhm);
			
			Integer ceilingKey = lhm.ceilingKey(3);
			System.out.println(ceilingKey);
			
			System.out.println(lhm.ceilingEntry(5));
			
			//lhm.clear();
			System.out.println(lhm.size());
			
			Object clone = lhm.clone();
			System.out.println(clone);
			
			lhm.compute(1, (key,value)->value.concat("Single"));
			System.out.println(lhm);
			
			System.out.println(lhm.containsValue(null));
			System.out.println(lhm.containsKey(5));
			
			NavigableSet<Integer> descendingKeySet = lhm.descendingKeySet();
			System.out.println(descendingKeySet);
			
			NavigableMap<Integer, String> descendingMap = lhm.descendingMap();
			System.out.println(descendingMap);
			
			System.out.println(lhm.firstEntry());
			System.out.println(lhm.firstKey());
			System.out.println(lhm.floorEntry(6));
			System.out.println(lhm.floorKey(6));
			System.out.println(lhm.getOrDefault(8, "chips"));
			System.out.println(lhm.headMap(4));
			System.out.println(lhm.headMap(5, true));
			System.out.println(lhm.higherEntry(5));
			System.out.println(lhm.higherKey(6));
			System.out.println(lhm.isEmpty());
			System.out.println(lhm.lastEntry());
			System.out.println(lhm.lastKey());
			System.out.println(lhm.lowerEntry(5));
			System.out.println(lhm.lowerKey(5));
			
			//lhm1.forEach(action);
			
			//lhm.merge(key, value, remappingFunction);
			
			System.out.println(lhm.pollFirstEntry());
			System.out.println(lhm.pollLastEntry());
			
			System.out.println(lhm);
			
			NavigableSet<Integer> navigableKeySet = lhm.navigableKeySet();
			System.out.println(navigableKeySet);
			
			SortedMap<Integer, String> subMap = lhm.subMap(3, 7);
			System.out.println(subMap);
			
			NavigableMap<Integer, String> subMap2 = lhm.subMap(4, true, 7, false);
			System.out.println(subMap2);
			
			SortedMap<Integer, String> tailMap = lhm.tailMap(5);
			System.out.println(tailMap);
			
			NavigableMap<Integer, String> tailMap2 = lhm.tailMap(4, true);
			System.out.println(tailMap2);
			
			Collection<String> values = lhm.values();
			System.out.println(values);
			
			Comparator<? super Integer> comparator = lhm.comparator();
			System.out.println(comparator);
			
			
			NavigableMap<Integer, String> checkedNavigableMap = Collections.checkedNavigableMap(subMap2, Integer.class, String.class);
			System.out.println("type safe view -"+checkedNavigableMap);
			
			
			
			
	}

}
