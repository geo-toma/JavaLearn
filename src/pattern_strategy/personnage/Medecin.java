package pattern_strategy.personnage;

import pattern_strategy.comportement.*;

public class Medecin extends Personnage {

	public Medecin() {
		soin = new PremierSoin();
	}

	public Medecin(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
		super(espritCombatif, soin, deplacement);
	}
	
}
