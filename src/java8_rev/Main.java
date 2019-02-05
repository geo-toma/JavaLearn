package java8_rev;

public class Main {

	public static void main(String[] args) {
		
		Reproduction.description();
		Mitose.description();
		Pondre.description();
		System.out.println();

		Alien alien = new Alien();
		alien.reproduire();
	}

}
