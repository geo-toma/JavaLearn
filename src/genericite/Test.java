package genericite;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		VoitureSansPermit voiture = new VoitureSansPermit(3);
		
		List<Voiture> listVoiture = new ArrayList<>();
		listVoiture.add(new Voiture(1));
		listVoiture.add(new Voiture(2));
		listVoiture.add(voiture);
		
		List<VoitureSansPermit> listVoitureSP = new ArrayList<>();
		listVoitureSP.add(new VoitureSansPermit(1));
		listVoitureSP.add(new VoitureSansPermit(2));
		
		List<Object> list = new ArrayList<>();
		list.add(new Object());
		list.add(new Object());
		
		Test test = new Test();
		test.affiche(listVoiture);
		test.affiche(listVoitureSP);
		test.affiche1(list);
		test.affiche1(listVoiture);
	}
	
	void affiche(List<? extends Voiture> list){
		for(Voiture vo : list)
			System.out.println(vo);
	}
	
	void affiche1(List<? super Voiture> list) {
		for(Object vo : list)
			System.out.println(vo);
	}

}
