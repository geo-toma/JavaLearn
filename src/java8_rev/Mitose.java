package java8_rev;

public interface Mitose extends Reproduction {

	public static void description() {
		Reproduction.description();
		System.out.println("Redefinie dans Mitose.java");
	}
	
	default void reproduire() {
		System.out.println("Je me divise");
	}
}
