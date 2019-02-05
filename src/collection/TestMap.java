package collection;

import java.util.*;

public class TestMap {

	public void tableDeHachage() {
		 Hashtable<Integer, String> ht = new Hashtable<>();

		    ht.put(1, "printemps");
		    ht.put(10, "été");
	        ht.put(12, "automne");
		    ht.put(45, "hiver");
		    
		    Enumeration<String> e = ht.elements();

		    while(e.hasMoreElements())
		      System.out.println(e.nextElement());


	}
}
