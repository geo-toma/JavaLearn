package pattern_strategy.comportement;

public class CombatCouteau implements EspritCombatif {
	@Override
	public void combat() {
		System.out.println("je me bats au couteau");
	}
}
