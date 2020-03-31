package application.directory;

import java.io.File;
import java.util.Scanner;

public class FileDirectory {

	public static void main(String[] args) {
		/**
		 * 
		 * Manipulando pastas com File
		 * 
		 * file.mkdir() -> retorna true, se o directorio do ficheiro foi criado com
		 * sucesso
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// para obter apenas as pastas
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// para obter apenas os arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println();
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//criar uma sub-pasta usando o file.mkdir()
		boolean sucess = new File(strPath+"\\subdir").mkdir();
		System.out.println("Directory create successfully: "+sucess);
		
		sc.close();
	}
}
