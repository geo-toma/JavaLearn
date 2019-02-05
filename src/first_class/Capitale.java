package first_class;


public class Capitale extends Ville {

	private String monument;
	public Capitale() {
		super();
		this.monument = "aucun";
	}
	public Capitale(String nomVille, String nomPays, int nbreHabitants, String monument) throws NombreHabitantException,NomDeVilleException {
		super(nomVille, nomPays, nbreHabitants);
		if (nbreHabitants < 0) {
			throw new NombreHabitantException(nbreHabitants);
		}
		if (nomVille.length() < 3) {
			throw new NomDeVilleException("le nom de a ville est inferieur a 3 caractere! nom = "+nomVille+"\n");
		}
		this.monument = monument;
	}
	
	@Override
	public String toString() {
		String str =  super.toString() + "\n \t ==>>" + this.monument+ " en est un monument";    
	    return str;
	}
	
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	
	
}
