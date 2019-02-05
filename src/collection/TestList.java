package collection;

import java.util.*;

public class TestList {

	public void listeChainee() {
		List<String> l = new LinkedList<>();

		l.add("12");
		l.add("toto ! !");
		l.add("12.20f");

		for (int i = 0; i < l.size(); i++)
			System.out.println("Élément à l'index " + i + " = " + l.get(i));

		System.out.println("\n \tParcours avec un itérateur ");
		System.out.println("-----------------------------------");
		ListIterator<String> li = l.listIterator();

		while (li.hasNext())
			System.out.println(li.next());
	}
	
	public void tableauListe() {
		ArrayList<Character> al = new ArrayList<>();

	    al.add('1');
	    al.add('n');
	    al.add('2');
	    al.add('d');
	               
	    for(int i = 0; i < al.size(); i++)
	      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
	    
	    System.out.println("\n \tParcours avec un itérateur ");
		System.out.println("-----------------------------------");
		ListIterator<Character> li = al.listIterator();

		while (li.hasNext())
			System.out.println(li.next());
	}

}
