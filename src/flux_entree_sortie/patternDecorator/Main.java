package flux_entree_sortie.patternDecorator;

public class Main {

	public static void main(String[] args) {
		
		Patisserie pat = new CoucheBiscuit(new CoucheCaramel(new CoucheChocolat(new Gateau())));
		System.out.println(pat.preparer());
	}

}
