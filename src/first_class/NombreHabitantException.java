package first_class;

public class NombreHabitantException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NombreHabitantException(int nbre) {
		System.out.println("Vous essayer d'instancier une classe ville avec un nombre d'habitant negatif! nbre = "+nbre+"\n");
	}
}
