package animal;

public class Tigre extends Fenin {
	public Tigre() {
	}
	public Tigre(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		System.out.println("je ronronne dans la foret");
	}
}
