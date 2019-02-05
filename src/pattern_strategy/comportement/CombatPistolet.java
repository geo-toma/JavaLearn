package pattern_strategy.comportement;

public class CombatPistolet implements EspritCombatif {
	@Override
	public void combat() {
		System.out.println("je combat au pistolet");
	}
}
