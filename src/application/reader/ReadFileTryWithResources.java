package application.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import application.DirectoryFolder;

public class ReadFileTryWithResources {

	public static void main(String[] args) {
		/**
		 * Bloco try-with-resources
		 * 
		 * É um bloco try que declara um ou mais recursos, e garante que esses recursos
		 * serão fechados ao final do bloco
		 * 
		 * fica muito melhor para leitura
		 */
		// criar um caminho do ficheiro
		String path = DirectoryFolder.inputFolder + "\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
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
		}
	}
}