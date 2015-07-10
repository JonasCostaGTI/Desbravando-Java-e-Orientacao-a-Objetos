/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 */
public class Livro_fisico extends Livro {
	
	
	/* funcao herdada da classe livro que obriga
	 * a passagem de um autor quando se criar um livro s
	 */
	public Livro_fisico(Autor autor){
		super(autor);
	}
	
	
	public double get_taxa_impressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplica_desconto_de(double porcentagem){
		if (porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicando desconto no livro fisico");
		return true;
	}
}
