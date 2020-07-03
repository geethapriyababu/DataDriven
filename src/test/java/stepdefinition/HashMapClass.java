package stepdefinition;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map=new HashMap<String,String>();
		HashMap<String,String> map1=new HashMap<String,String>();
		
		map1.put("USA", "LA");
		map1.put("America", "NY");
		map1.put("US", "Texas");
		map1.put("USA", "California");
		
	      map.put("a","Amit");    
	      map.put("b","Vijay");    
	      map.put("d","Rahul"); 
	      map.put(null,"Sanjay");
	      map.put("d", "Imran");
	      map.put("g", "George");
	      map.put(null, "Tharun");
	      map.put("j", null);
	      map.put("n", null);

	      Set set=map.entrySet();
	      System.out.println(set);
	      Set<Entry<String, String>> m=map.entrySet();
	      for (Entry<String,String> entry : m) {
			System.out.println(entry.getValue());
		}
	      Iterator itr=set.iterator();  
	      
	      while(itr.hasNext()){  
	          //Converting to Map.Entry so that we can get key and value separately  
	          Map.Entry entry=(Map.Entry)itr.next();
	          System.out.println(entry.getKey()+" "+entry.getValue());  
	      }
	      Object clone = map.clone();
	      System.out.println(clone);
	      
	      System.out.println(map.containsKey("s"));
	      
	      System.out.println(map.containsValue("Tharun"));
	      
	      System.out.println(map.get("d"));
	      
	      System.out.println(map.getOrDefault("s", "some"));
	      
	      System.out.println(map.isEmpty());
	      
	      System.out.println(map.putIfAbsent("s", "Sam"));
	      System.out.println(set);
	      
	      map.remove("a");
	      System.out.println(set);
	      
	      map.putAll(map1);
	      System.out.println(set);
	      
	      map.remove("j", "soem");
	      System.out.println(set);
	      
	      map.remove("j", null);
	      System.out.println(set);
	      
	      map.remove("n");
	      System.out.println(set);
	      
	      map.replace("b", "Ajith");
	      System.out.println(set);
	      
	      map.replace("b", "Ajith", "Vijay");
	      System.out.println(set);
	      
	      System.out.println(map.size());
	      
	      Collection<String> values = map.values();
	      for (String string : values) {
	    	  System.out.println(string);
		}
	      
	     
	}

}
