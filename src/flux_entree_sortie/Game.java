package flux_entree_sortie;

import java.io.Serializable;

public class Game implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nom, style;
	private double prix;
	
	//private transient Notice notice;  l'objet sera oublier lors de la serialisation
	// si on veut serialiser l'objet aussi on implemente serializable dans sa classe
	
	public Game(String nom, String style, double prix) {
		super();
		this.nom = nom;
		this.style = style;
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Nom de jeu : "+this.nom+"\n"
				+ "Style de jeu : "+this.style+"\n"
				+ "Prix du jeu : "+this.prix;
	}
	
	
}
