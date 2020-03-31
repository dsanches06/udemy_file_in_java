package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Product;

public class Exercicios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the path: ");
		String strPath = DirectoryFolder.inputFolder + "\\" + sc.nextLine();
		String[] result = null;
		List<Product> products = new ArrayList<>();

		try {
			//ler dados do ficheiro com scanner
			sc = new Scanner(new File(strPath));
			while (sc.hasNextLine()) {
				result = sc.nextLine().split(";");
				
				String name = result[0];
				double price = Double.parseDouble(result[1].replace(",", "."));
				int quantity = Integer.parseInt(result[2]);
				products.add(new Product(name, price, quantity));
			}
			
			System.out.println();
			System.out.println("PRODUCTS:");
			for (Product product : products) {
				System.out.println(product);
			}
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
