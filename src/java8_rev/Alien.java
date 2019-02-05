package java8_rev;

public class Alien implements Pondre, Mitose {

	@Override
	public void reproduire() {
		System.out.println("je suis un alien");
		Mitose.super.reproduire();
		Pondre.super.reproduire();
	}

}
