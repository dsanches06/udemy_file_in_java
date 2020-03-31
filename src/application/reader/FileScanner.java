package application.reader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import application.DirectoryFolder;

public class FileScanner {

	public static void main(String[] args) {
		/*
		 * ---- LEITURA DE FICHEIROS COM SCANNER ----
		 * 
		 * File - Representação abstrata de um arquivo e seu caminho
		 * 
		 * Scanner - Leitor de texto
		 * 
		 * IOException (Exception)
		 * 
		 * Bloco try-with-resources 
		 * 
		 * • É um bloco try que declara um ou mais recursos, e
		 * garante que esses recursos serão fechados ao final do bloco
		 * 
		 */

		// criar um caminho do ficheiro para leitura
		String path = DirectoryFolder.inputFolder + "\\in.txt";
		// cria um ficheiro
		File file = new File(path);
		// declarar o scanner
		Scanner sc = null;
		try {
			// instanciar o scanner com ficheiro
			sc = new Scanner(file);
			// faz a leitura, por enquanto houver linha
			while (sc.hasNextLine()) {
				// imprimir essa linha
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
