/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 */
public class Regras_de_desconto {

	public static void main(String[] args) {
		
		
		Autor autor = new Autor();	
		autor.setNome("Rodrigo turini");
		
		Livro livro = new Mini_livro(autor);
		livro.setValor(39.90);
		
		Livro ebook = new Ebook(autor);
		ebook.setValor(59.90);
		
		
		
		
		
		

	}

}
