package teste;

import java.io.FileNotFoundException;

public class Teste {

	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txt");
			System.out.println("abri");
		} catch (FileNotFoundException e) {
			System.out.println("nao consegui abrir " + e);
			
		}

	}

}
