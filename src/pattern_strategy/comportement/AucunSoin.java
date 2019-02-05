package pattern_strategy.comportement;

public class AucunSoin implements Soin {
	@Override
	public void soigner() {
		System.out.println("je ne soigne pas");
	}
}
