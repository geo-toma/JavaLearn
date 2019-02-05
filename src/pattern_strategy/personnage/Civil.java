package pattern_strategy.personnage;

import pattern_strategy.comportement.*;

public class Civil extends Personnage {

	public Civil() {
	}

	public Civil(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
		super(espritCombatif, soin, deplacement);
	}
		
}
