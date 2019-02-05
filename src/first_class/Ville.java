package first_class;

import java.util.Objects;

public class Ville {
	
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;

	public Ville() {
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbreHabitants = 0;
		setCategorie();
	}
	
	public Ville(String nomVille, String nomPays, int nbreHabitants) throws NombreHabitantException,NomDeVilleException{
		if (nbreHabitants < 0) {
			throw new NombreHabitantException(nbreHabitants);
		}
		if (nomVille.length() < 3) {
			throw new NomDeVilleException("le nom de a ville est inferieur a 3 caractere! nom = "+nomVille+"\n");
		}
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbreHabitants = nbreHabitants;
		setCategorie();
	}
	
	@Override
	public String toString() {
		String string = nomVille+" est une ville de "+nomPays+", elle comporte "+nbreHabitants+" habitants; elle est donc de categorie "+getCategorie();
		return string;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
		setCategorie();
	}
	
	public char getCategorie() {
		return categorie;
	}

	public void setCategorie() {
		int[] nbreHabits = {0,10,100,1000,10000,100000,500000,1000000,5000000,10000000};
		char[] categories = {'?','A','B','C','D','E','F','G','H','I'};
		int i = 0;
		while (i < nbreHabits.length && nbreHabitants > nbreHabits[i])
			i++;
		categorie = categories[i];
	}
	
	public String comparer(Ville ville) {
		String string = new String();
		if (ville.nbreHabitants < nbreHabitants) 
			string = "la ville "+nomVille+" est plus peuplee que "+ville.nomVille;
		else if (ville.nbreHabitants > nbreHabitants)
			string = "la ville "+ville.nomVille+" est plus peuplee que "+nomVille;
		else 
			string = "la ville "+nomVille+" contient le meme nombre d'habitant que "+ville.nomVille;
		return string;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categorie, nbreHabitants, nomPays, nomVille);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		
		return Objects.equals(other.getCategorie(), this.getCategorie())&&
				Objects.equals(other.nomVille, this.nomVille)&&
				Objects.equals(other.getNbreHabitants(), this.getNbreHabitants())&&
				Objects.equals(other.nomPays, this.nomPays);
	}
	
	

}
