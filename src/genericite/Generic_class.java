package genericite;

public class Generic_class<Type> {

	private Type valeur;

	public Generic_class() {
		this.valeur = null;
	}

	public Generic_class(Type valeur) {
		this.valeur = valeur;
	}

	public Type getValeur() {
		return valeur;
	}

	public void setValeur(Type valeur) {
		this.valeur = valeur;
	}
	
}
