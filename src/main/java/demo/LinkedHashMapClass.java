package demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "Ball");
		lhm.put(2, "Doll");
		lhm.put(3, "Helicopter");
		lhm.put(3, "Bat");
		lhm.put(null, "Super");
		lhm.put(5, null);
		lhm.put(null,"None");
		lhm.put(6, "Monkey");
		lhm.put(7, "Super");
		
		LinkedHashMap<Integer,String> lhm1=new LinkedHashMap<Integer,String>();
		
		lhm1.put(5, "Pencil");
		lhm1.put(6, "Cucumber");
		lhm1.put(4, "Garlic");
		
		//System.out.println(lhm);
		
		Set<Entry<Integer,String>> s=lhm.entrySet();
		Iterator<Entry<Integer, String>> iterator = s.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next().getValue());

		Object clone = lhm.clone();
		System.out.println(clone);
		//lhm.clear();
		//System.out.println(lhm.size());
		
		//lhm.compute(key, remappingFunction)
		
		lhm.compute(1, (key, val)->val.concat(" Singh")); 
		System.out.println(lhm);
		
		lhm.computeIfPresent(2, (key, val)->val.concat(" Singh")); 
		System.out.println(lhm);
		
		lhm.computeIfAbsent(8, k->"Nice");
		System.out.println(lhm);
		
		//lhm.putAll(lhm1);
		//System.out.println(lhm);
		
		lhm.putIfAbsent(5, "Rubber");
		System.out.println(lhm);
		
		lhm.remove(4);
		System.out.println(lhm);
		
		//lhm.replaceAll((key,value)->value="Nothing");
		//System.out.println(lhm);
		
		lhm1.forEach(
			    (key, value) -> lhm.merge( key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2)
			);

		System.out.println(lhm);
		
		Map<Integer, String> checkedMap = Collections.checkedMap(lhm, Integer.class, String.class);
		System.out.println("type safe view-"+checkedMap);
		
		
	//	lhm1.merge(key, value, remappingFunction);
		
		 
		
		
	}

}
