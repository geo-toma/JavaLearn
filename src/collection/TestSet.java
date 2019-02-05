package collection;

import java.util.*;

public class TestSet {

	public void hashSet() {
		HashSet<Integer> hs = new HashSet<>();

	    hs.add(3);
	    hs.add(12);
	    hs.add(61);

	    Iterator<Integer> it = hs.iterator();

	    while(it.hasNext())
	      System.out.println(it.next());

	    System.out.println("\nParcours avec un tableau d'objet");
	    System.out.println("-----------------------------------");
	                
	    Object[] obj = hs.toArray();

	    for(Object o : obj)
	      System.out.println(o); 
	}
}
