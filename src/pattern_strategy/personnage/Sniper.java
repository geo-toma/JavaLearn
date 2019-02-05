package pattern_strategy.personnage;

import pattern_strategy.comportement.*;

public class Sniper extends Personnage {

	public Sniper() {
		espritCombatif = new CombatPistolet();
	}

	public Sniper(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
		super(espritCombatif, soin, deplacement);
	}
		
}
