package flux_entree_sortie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test_Jv_NIO2 {

	public void objectPath() {
		Path path = Paths.get("test.txt");
		System.out.println("chemin absolu du fichier : "+path.toAbsolutePath());
		System.out.println("nom du fichier : "+path.getFileName());
		System.out.println("est ce que le fichier existe : "+Files.exists(path));
		System.out.println("est ce que c'est un repertoire : "+Files.isDirectory(path));
		
		try {
			Files.createFile(Paths.get("D:/txt.txt"));
			Files.createDirectories(Paths.get("D:/texte"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("affichage des lecteurs a la racine du pc ");
		
		Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();
		for(Path chemin : roots) {
			System.out.println(chemin);//affiche les lecteurs
			
			try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin)) { // on peut filtrer le resultat
				for (Path nom : listing) {
					System.out.println("\t"+((Files.isDirectory(nom))? nom+"/" : nom));
				}
			} catch (FileSystemException e) {
				//e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// copie 
		Path path1 = Paths.get("test3.txt");
		try {
			Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//deplacement
		Path path2 = Paths.get("test1.txt");
		try {
			Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Files.delete(Paths.get("D:/texte"));
			Files.delete(Paths.get("D:/txt.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lecEtEcrStream() {
		Path path = Paths.get("test.txt");
		Path path1 = Paths.get("test3.txt");
		
		try (InputStream input = Files.newInputStream(path);
				OutputStream output = Files.newOutputStream(path1)) {
			byte[] buf = new byte[1];
			int i = 0;
			while(input.read(buf) >= 0) {
				output.write(buf);
				System.out.print("\t"+buf[0]+"("+(char)buf[0]+")");
				i++;
				if(i%8 == 0) System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lecEtEcrDeRetW() {
		Path path = Paths.get("RetW.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			String str = "coucou les gentils";
			writer.write(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String str1 = "";
			int i = 0;
			while((i = reader.read()) != -1) 
				str1 += (char)i;
			System.out.println(str1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void zipFileManage() {
//		try {
//			Files.createFile(Paths.get("zipFile.zip"));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		try(FileSystem zipFS = FileSystems.newFileSystem(Paths.get("zipFile.zip"), null)) {
			// copie d'un fichier depuis l'ordinateur dans le zip
			Files.copy(Paths.get("test.txt"), zipFS.getPath("text.txt"));
			Files.copy(Paths.get("test1.txt"), zipFS.getPath("text1.txt"));
			Files.copy(Paths.get("test2.txt"), zipFS.getPath("text2.txt"));
			Files.copy(Paths.get("test0.txt"), zipFS.getPath("text3.txt"));
			Files.copy(Paths.get("file.txt"), zipFS.getPath("file.txt"));

			Path path = zipFS.getPath("create.txt");
			String str = "creation dun file a l'interieur du zip";
			Files.write(path, str.getBytes());
			
			Files.deleteIfExists(zipFS.getPath("file.txt"));
			
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(zipFS.getPath("/"))) {
				for(Path entyPath : stream)
					System.out.println(entyPath);
			} catch (FileSystemException e) {
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createZipFile() {
//		try {
//			Files.createFile(Paths.get("zipFile123.zip"));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
	}
}
