package pattern_strategy.comportement;

public class Marcher implements Deplacement {
	@Override
	public void deplace() {
		System.out.println("je me deplace en marchant");
	}
}
