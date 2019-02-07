package flux_entree_sortie;

public class Notice {
	
	private String lang;

	public Notice() {
		this.lang = "Francais";
	}

	public Notice(String lang) {
		this.lang = lang;
	}
	
	@Override
	public String toString() {
		return "la langue de la notice :"+this.lang;
	}
}
