/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 */
public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public  Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "0000-00000-000-0000";
	}
	
	public Livro(){
		System.out.println("Novo livro criado");
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	
	void mostra_detalhes(){
		System.out.println("DETALHES DO LIVRO ");
		System.out.println("O nome do livro é, "+nome);
		System.out.println("descricao: "+descricao);
		System.out.println("esta com o valor de R$ "+valor);
		System.out.println("e seu ISBN é: "+isbn);
		
		
		if (this.tem_autor()) {
			autor.mostra_detalhes();
		}
	}
	
	public boolean tem_autor() {
		return this.nome != null;
	}

	
	public String toString() {
		return nome;
	}

	

}
