package animal;

public class Chat extends Fenin {
	public Chat() {
	}
	public Chat(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		System.out.println("je miaule quand j'ai fin");
	}
}
