package genericite;

public class Voiture {

	protected int val;
	
	public Voiture(int val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		return "Voiture "+val;
	}
}
