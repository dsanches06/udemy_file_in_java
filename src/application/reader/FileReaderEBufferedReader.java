package application.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import application.DirectoryFolder;

public class FileReaderEBufferedReader {

	public static void main(String[] args) {
		/*
		 * * ---- LEITURA DE FICHEIROS COM FILE READER E BUFFERED READER ----
		 * 
		 * IOException (Exception)
		 * 
		 * FileReader (stream de leitura de caracteres a partir de arquivos)
		 * 
		 * BufferedReader (mais rápido)
		 * 
		 */

		// criar um caminho do ficheiro para leitura
		String path = DirectoryFolder.inputFolder + "\\in.txt";
		// declarar um File Reader
		FileReader fr = null;
		// declarar o Buffered Reader
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			// ler uma linha
			String line = br.readLine();
			// por enquanto, a leitura da linha for diferente de nulo
			while (line != null) {
				// imprimi a linha lida
				System.out.println(line);
				// e continuar faz a ler novamente a linha seguinte
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
