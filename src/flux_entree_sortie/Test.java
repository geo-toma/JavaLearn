package flux_entree_sortie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.io.StringWriter;

public class Test {

	public void objetFile() {
		File f = new File("test.txt");
		System.out.println("Chemin absolu du fichier " + f.getAbsolutePath());
		System.out.println("Nom du fichier " + f.getName());
		System.out.println("Est-ce que le fichier existe? " + f.exists());
		System.out.println("Est-ce que c'est un repertoire? " + f.isDirectory());
		System.out.println("Est-ce que c'est un fichier? " + f.isFile());

		File createRepo = new File("D:/texte");
		createRepo.mkdirs();
		File createFile = new File("D:/txt.txt");
		try {
			createFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("Affichage des lecteurs a la racine du pc");

		for (File file : File.listRoots()) {
			System.out.println(file.getAbsolutePath());
			try {
				int i = 1;
				// browse all file in reader at root
				for (File nom : file.listFiles()) {
					System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));
					if (i % 4 == 0)
						System.out.println();
					i++;
				}
				System.out.println();
			} catch (NullPointerException e) {
			}
		}

		createRepo.delete();// work only if the repository is empty
		createFile.delete();
	}

	public void fisEtFos() {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test1.txt"));
			byte[] buf = new byte[8];
			while (fis.read(buf) >= 0) {
				fos.write(buf);
				for (byte bit : buf)
					System.out.print("\t" + bit + "(" + (char) bit + ")");
				System.out.println();
				buf = new byte[8];
			}
			System.out.println("la copie est terminee");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

		System.out.println((new File("test1.txt").getAbsolutePath()));
	}

	public void filterIsEtOs() {
		FileInputStream fis;
		FileOutputStream fos; 
		BufferedInputStream bis;
		BufferedOutputStream bos;
		try {
			fis = new FileInputStream(new File("test0.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("test0.txt")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("test2.txt")));
			byte[] buf = new byte[8];
			long startTime = System.currentTimeMillis();
			while (fis.read(buf) != -1) fos.write(buf);
			System.out.println("le temp de lecture et d'ecriture avec FileInputStream est : " + (System.currentTimeMillis() - startTime));
			startTime = System.currentTimeMillis();
			while (bis.read(buf) != -1) bos.write(buf);
			System.out.println("le temps de lecture et d'ecriture avec BufferedInputStream est : " + (System.currentTimeMillis() - startTime));
			fis.close();
			fos.close();
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dataIsEtOs() {
		DataInputStream dis;
		DataOutputStream dos;
		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("file.txt"))));
			dos.writeBoolean(true);
			dos.writeByte(100);
			dos.writeChar('v');
			dos.writeDouble(12.43);
			dos.writeInt(562);
			dos.writeFloat(67.3211F);
			dos.writeDouble(23.075);
			dos.writeLong(12356789098765L);
			dos.writeShort(2);
			dos.close();
			// lecture dans le meme ordre d'ecriture ce qui implique qu'on doit tout lire
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("file.txt"))));
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readShort());
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void serialisation() {
		File file = new File("game.txt");
		ObjectInputStream ois;
		ObjectOutputStream oos;
		try {
			if (!file.exists()) {
				oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				System.out.println("je cree les objet game");
				Game game = new Game("coc", "strategie", 120);
				Game game1 = new Game("pes", "foot", 200);
				oos.writeObject(game);
				oos.writeObject(game1);
				System.out.println(game+"\n\n"+game1);
				oos.close();
			}else {
				ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
				System.out.println("je ne creer plus les objets");
				try {
					// lecture dans l'ordre (on peut creer un tableau d'object et les mettre dedans comme xa on peut prendre celui qu'on veut)
					System.out.println(((Game)ois.readObject()));
					System.out.println(((Game)ois.readObject()));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				ois.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void charArrayRetW() {
		CharArrayWriter caw = new CharArrayWriter();
	    CharArrayReader car;
			
	    try {
	      caw.write("Coucou les Zéros");
	      //Appel à la méthode toString de notre objet de manière tacite
	      System.out.println(caw);
				
	      //caw.close() n'a aucun effet sur le flux
	      //Seul caw.reset() peut tout effacer
	      caw.close();
				
	      //On passe un tableau de caractères à l'objet qui va lire le tampon
	      car = new CharArrayReader(caw.toCharArray());
	      int i;
	      //On remet tous les caractères lus dans un String
	      String str = "";
	      while(( i = car.read()) != -1)
	        str += (char) i;
				
	      System.out.println(str);

	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}

	public void stringRetW() {
		    StringWriter sw = new StringWriter();
		    StringReader sr;
				
		    try {
		      sw.write("Coucou les Zéros");
		      //Appel à la méthode toString de notre objet de manière tacite
		      System.out.println(sw);
					
		      //caw.close() n'a aucun effet sur le flux
		      //Seul caw.reset() peut tout effacer
		      sw.close();
					
		      //On passe un tableau de caractères à l'objet qui va lire le tampon
		      sr = new StringReader(sw.toString());			
		      int i ;
		      //On remet tous les caractères lus dans un String
		      String str = "";
		      while(( i = sr.read()) != -1)
		        str += (char) i;

		      System.out.println(str);

		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}

	public void fileRetW() {
		File file = new File("fileTestFileWetR");
		FileWriter fw;
		FileReader fr;
		try {
			fw = new FileWriter(file);
			String str = "coucou les con";
			fw.write(str);
			fw.close();
			
			fr = new FileReader(file);
			String str1 = "";
			int i = 0;
			while((i = fr.read()) != -1)
				str1 += (char)i;
			System.out.println(str1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
