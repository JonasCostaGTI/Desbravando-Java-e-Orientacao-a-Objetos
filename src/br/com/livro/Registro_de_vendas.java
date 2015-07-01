package br.com.livro;

public class Registro_de_vendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		Livro_fisico fisico = new Livro_fisico(autor);
		fisico.setNome("Test-Driven Development");
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test- Driven Development");
		
		
		Carrinho_de_compra carrinho = new Carrinho_de_compra();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		
		

	}

}
