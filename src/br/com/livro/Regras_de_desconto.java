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
		
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		
		
		System.out.println("Valor atual do livro: " + livro.getValor());
		
		if (livro.aplica_desconto_de(0.30)) {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}else {
			System.out.println("Desconto nao pode ser maior que 30% ");
		}
		
		
		Ebook ebook = new Ebook(autor);
		
		ebook.setValor(29.90);
		if (!ebook.aplica_desconto_de(0.15)) {
			System.out.println("Desconto no Ebook nao pode ser maior que 15% ");
		}else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
		

	}

}
