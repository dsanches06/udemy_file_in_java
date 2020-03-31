package application.path;

import java.io.File;
import java.util.Scanner;

public class FileNameAndPath {

	public static void main(String[] args) {
		/*
		 * Informações do caminho do arquivo
		 * 
		 *  file.getPath() -> para mostrar a pasta do ficheiro
		 * 
		 *  file.getName() -> para mostar o nome do ficheiro
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("File name: "+path.getName());
		System.out.println("File path"+path.getPath());
		System.out.println("GetParent: "+path.getParent());
		
		sc.close();

	}

}
