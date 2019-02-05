package pattern_strategy.personnage;

import pattern_strategy.comportement.*;

public class Guerrier extends Personnage {

	public Guerrier() {
		espritCombatif = new CombatPistolet();
	}

	public Guerrier(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
		super(espritCombatif, soin, deplacement);
	}
	
}
