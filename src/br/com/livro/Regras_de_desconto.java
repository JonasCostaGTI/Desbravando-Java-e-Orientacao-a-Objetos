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
		
		
		if (!ebook.aplica_desconto_de(0.14)) {
			System.out.println("Desconto no ebook livro nao pode ser maior que 15% ");
		}else {
			System.out.println("Valor do ebooki livro com desconto: " + ebook.getValor());
		}
		
		
		
		if (!livro.aplica_desconto_de(0.3)) {
			System.out.println("Desconto no Mini livro nao pode ser maior que 15% ");
		}else {
			System.out.println("Valor do Mini livro com desconto: " + livro.getValor());
		}
		

	}

}
