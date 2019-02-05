package animal;

public class Lion extends Fenin {
	public Lion() {
	}
	public Lion(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		System.out.println("je rugit pour faire peur");
	}
}
