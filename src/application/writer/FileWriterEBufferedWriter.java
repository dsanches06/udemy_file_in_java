package application.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import application.DirectoryFolder;

public class FileWriterEBufferedWriter {

	public static void main(String[] args) {
		/*
		 * * ---- ESCRITA DE FICHEIROS COM FILE READER E BUFFERED WRITER ----
		 * 
		 * File - Representação abstrata de um arquivo e seu caminho
		 * 
		 * IOException (Exception)
		 * 
		 * Bloco try-with-resources • É um bloco try que declara um ou mais recursos, e
		 * garante que esses recursos serão fechados ao final do bloco
		 * 
		 * FileWriter (stream de escrita de caracteres em de arquivos) • Cria/recria o
		 * arquivo: new FileWriter(path) • Acrescenta ao arquivo existente: new
		 * FileWriter(path, true)
		 * 
		 * BufferedWriter (mais rápido)
		 * 
		 * 
		 */

		// um array de String
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		// criar um caminho do ficheiro já existente para escrita
		String path = DirectoryFolder.inputFolder + "\\out.txt";

		// criar um novo buffered writer e file writer com path ,
		// e true por ter o ficheiro já criado
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			// por cada linha escrita
			for (String line : lines) {
				// escrever no arquivo
				bw.write(line);
				//saltar uma linha
				bw.newLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
