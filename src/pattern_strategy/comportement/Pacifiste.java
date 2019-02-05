package pattern_strategy.comportement;

public class Pacifiste implements EspritCombatif{
	@Override
	public void combat() {
		System.out.println("je ne combat pas");
	}
}
