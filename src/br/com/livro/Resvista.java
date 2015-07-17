/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 *
 * 14/07/2015
 */

public class Resvista implements Produto, Promocional{
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
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



	public boolean aplica_desconto_de(double porcentagem){
		if (porcentagem > 0.1) {
			return false;
		}
		
		double desconto = getValor() - porcentagem;
		setValor(getValor() - desconto);
		return true;
		
		
	}

}
