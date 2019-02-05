package animal;

public abstract class Animal {
	
	protected int poids;
	protected String couleur;
	
	public void manger() {
		System.out.println("je mange de la viande");
	}
	public void boire() {
		System.out.println("je bois de l'eau");
	}
	
	abstract void deplacement();
	abstract void crier();
	
	@Override
	public String toString() {
		String string = "je suis un objet de la "+this.getClass()+", je pese "+this.poids+"kilo ;"
				+ " je suis "+this.couleur;		
		return string;
	}
}
