package genericite;

public class VoitureSansPermit extends Voiture {

	public VoitureSansPermit(int val) {
		super(val);
	}

	@Override
	public String toString() {
		return "Voiture sans permit "+val;
	}
}
