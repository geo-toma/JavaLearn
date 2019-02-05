package genericite;

public class Main {

	public static void main(String[] args) {
		Solo solo = new Solo(12);
		int nbre = (Integer)solo.getValeur();
		System.out.println(nbre);
		
		Generic_class<Integer> val = new Generic_class<>(12);
		int nbr = val.getValeur();
		System.out.println(nbr);
		
		Multi_generic<String, Integer> dual = new Multi_generic<>("moi",20);
		String str = dual.getValeur();
		int nb = dual.getValeur1();
		System.out.println(str+nb);
		
		Generic_class<?> gen = new Generic_class<>("moi"); // wildcard
		String nbres = (String) gen.getValeur();
		System.out.println(nbres);
		gen = val;
		int nobres = (int)gen.getValeur();
		System.out.println(nobres);
		//gen.setValeur(23); ne fonctionne pas
		
		
	}

}
