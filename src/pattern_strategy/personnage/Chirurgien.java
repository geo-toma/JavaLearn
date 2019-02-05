package pattern_strategy.personnage;

import pattern_strategy.comportement.*;

public class Chirurgien extends Personnage {

	public Chirurgien() {
		soin = new Operation();
	}

	public Chirurgien(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
		super(espritCombatif, soin, deplacement);
	}
	
	
	
}
