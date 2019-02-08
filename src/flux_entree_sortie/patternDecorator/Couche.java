package flux_entree_sortie.patternDecorator;

public abstract class Couche extends Patisserie {

	protected Patisserie pat;
	protected String nom;
	
	public Couche(Patisserie pat) {
		super();
		this.pat = pat;
	}
	
	String preparer() {
		String str = pat.preparer();
		return str + nom;
	}
}
