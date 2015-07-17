package br.com.livro;

public class Registro_de_vendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		Livro_fisico fisico = new Livro_fisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);

		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test- Driven Development Ebook");
		ebook.setValor(29.90);
		
		Carrinho_de_compra carrinho = new Carrinho_de_compra();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		if (fisico.aplica_desconto_10porcento()) {
			System.out.println("Valor agora é de: " + fisico.getValor());
		}
		
		
		

	}

}
