package pattern_strategy.comportement;

public class PremierSoin implements Soin {
	@Override
	public void soigner() {
		System.out.println("j'administre des premiers soins");
	}
}
