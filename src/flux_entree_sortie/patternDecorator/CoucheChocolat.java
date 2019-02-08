package flux_entree_sortie.patternDecorator;

public class CoucheChocolat extends Couche {

	public CoucheChocolat(Patisserie pat) {
		super(pat);
		this.nom = "\t- Couche de chocolat\n";
	}
}
