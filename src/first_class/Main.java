package first_class;

public class Main {
	public static void main(String[] args) {
		Ville[] tableau = new Ville[4];
		String[] tab = { "Lome", "Ka", "Aneho", "Sokode" };
		int[] tab1 = { 723, 321, 345, -143 };
		for (int i = 0; i < 4; i++) {
			if (i > 1) {
				try {
					tableau[i] = new Ville(tab[i], "Togo", tab1[i]);
				} catch (NombreHabitantException | NomDeVilleException e) {
					System.out.println(e.getMessage());
				}
			} else {
				try {
					tableau[i] = new Capitale(tab[i], "Togo", tab1[i], "MONUMENT");
				} catch (NombreHabitantException | NomDeVilleException e) {
					System.out.println(e.getMessage());
				}
			}
		}

		for (Object ville : tableau)
			System.out.println(ville + "\n");
		
		System.out.println("\n----------------------------------------------------------------------------------");

		Ville ville = new Ville();
		Capitale capitale = null;
		try {
			capitale = new Capitale("moi", "toi", 231, "mon");
		} catch (NombreHabitantException e) {
			e.printStackTrace();
		} catch (NomDeVilleException e) {
			e.printStackTrace();
		} finally {
			if (capitale == null) {
				capitale = new Capitale();
			}
		}
		ville = capitale;
		System.out.println(ville);
	}
}
