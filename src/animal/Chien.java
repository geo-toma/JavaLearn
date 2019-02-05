package animal;

public class Chien extends Canin implements Rintintitn {
	public Chien() {
	}
	
	public Chien(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		System.out.println("j'aboie pour prevenir");
	}
	
	@Override
	public void faireCalin() {
		System.out.println("je fais de tres gros calin");
	}
	@Override
	public void faireLeBeau() {
		System.out.println("je fais le beau");
	}
	@Override
	public void faireLechouille() {
		System.out.println("je fais de grosse lechouille");
	}
}
