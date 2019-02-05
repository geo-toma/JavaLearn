package enumeration;

public class Main {

	public static void main(String[] args) {

		for (Langage lang : Langage.values()) {
			if (Langage.JAVA.equals(lang))
				System.out.println("J'aime " + lang + " editer par " + lang.getEditor());
			else
				System.out.println(lang + " : " + lang.getEditor());
		}
		
	}

}
