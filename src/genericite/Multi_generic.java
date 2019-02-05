package genericite;

public class Multi_generic<Type,Type1> {

	private Type valeur;
	private Type1 valeur1;
	public Multi_generic() {
		valeur = null;
		valeur1 = null;
	}
	public Multi_generic(Type valeur, Type1 valeur1) {
		this.valeur = valeur;
		this.valeur1 = valeur1;
	}
	public Type getValeur() {
		return valeur;
	}
	public void setValeur(Type valeur) {
		this.valeur = valeur;
	}
	public Type1 getValeur1() {
		return valeur1;
	}
	public void setValeur1(Type1 valeur1) {
		this.valeur1 = valeur1;
	}
	
	
}
