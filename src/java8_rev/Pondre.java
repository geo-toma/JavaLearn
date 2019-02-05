package java8_rev;

public interface Pondre extends Reproduction {

	public static void description() {
		Reproduction.description();
		System.out.println("redefinie dans Pondre.java");
	}
	
	default void reproduire() {
		System.out.println("Je pond des oeufs");
	}
}
