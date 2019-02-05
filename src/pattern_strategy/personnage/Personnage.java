package pattern_strategy.personnage;

import pattern_strategy.comportement.*;

public abstract class Personnage {
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Soin soin = new AucunSoin();
	protected Deplacement deplacement = new Marcher();
	
	

	public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
		super();
		this.espritCombatif = espritCombatif;
		this.soin = soin;
		this.deplacement = deplacement;
	}

	public Personnage() {
	}

	public void seDeplacer() {
		deplacement.deplace();
	}
	public void combattre() {
		espritCombatif.combat();
	}
	public void soigner() {
		soin.soigner();
	}

	public void setEspritCombatif(EspritCombatif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}

	public void setSoin(Soin soin) {
		this.soin = soin;
	}

	public void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}
	
}
