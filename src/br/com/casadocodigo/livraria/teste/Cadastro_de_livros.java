/**
 * 
 */
package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Livro_fisico;

/**
 * @author jonascosta
 */
public class Cadastro_de_livros {


	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Jonas costa");
		autor.setE_mail("jonas.costa1987@gmail.com");
		autor.setCPF("738-591-450-92");
		
	
		Livro livro = new Livro_fisico(autor);
		livro.setNome("Aprendendo Java");
		livro.setDescricao("Aprendendo a programar com java");	
		livro.setValor(59.90);
		livro.setIsbn("1234-5678-9");
		livro.mostra_detalhes();
	
		
		
		Autor outro_autor = new Autor();
		outro_autor.setNome("Joao");
		outro_autor.setCPF("38256874284409");
		outro_autor.setE_mail("Jon.costa@icloud.com");
		
		
		Livro outro_livro = new Livro_fisico(outro_autor);
		outro_livro.setNome("Tecnicas de programacao");
		outro_livro.setDescricao("aprendendo a programar");
		outro_livro.setValor(59.90);
		outro_livro.setIsbn("1234-5678-10");
		
		System.out.println("*****************");
		outro_livro.mostra_detalhes();
		
		
		System.out.println("********Ebook*********");
		Autor autor_ebook = new Autor();
		Ebook ebook = new Ebook(outro_autor);
		
		ebook.setNome("Java 8 pratico");
		autor_ebook.setNome("Jonas Costa Ebook");
		ebook.setValor(13);
		System.out.println(ebook);
		
		
		
		ebook.mostra_detalhes();
	
		
		
	}

}
