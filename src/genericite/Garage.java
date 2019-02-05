package genericite;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) {

		List<Voiture> listVoiture = new ArrayList<>();
		listVoiture.add(new Voiture(1));
		listVoiture.add(new Voiture(2));
		
		List<VoitureSansPermit> listVoitureSP = new ArrayList<>();
		listVoitureSP.add(new VoitureSansPermit(1));
		listVoitureSP.add(new VoitureSansPermit(2));
		
		Garage garage = new Garage();
		garage.add(listVoiture);
		System.out.println("--------------------------------------------------------------------------------");
		garage.add(listVoitureSP);
		System.out.println("\n"+garage.list.get(0).getClass());
	}
	
	List<Voiture> list = new ArrayList<>();
	
	void add(List<? extends Voiture> listVoiture) {
		for(Voiture voiture : listVoiture)
			list.add(voiture);
		System.out.println("Contenu de garage");
		for(Voiture voiture : list)
			System.out.println(voiture);
	}

}
