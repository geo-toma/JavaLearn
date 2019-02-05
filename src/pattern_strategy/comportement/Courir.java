package pattern_strategy.comportement;

public class Courir implements Deplacement {
	@Override
	public void deplace() {
		System.out.println("je me deplace en courant");
	}
}
