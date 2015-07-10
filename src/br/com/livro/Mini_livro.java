/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 *
 * 10/07/2015
 */

public class Mini_livro extends Livro {
	
	public Mini_livro(Autor autor){
		super(autor);
	}
	
	@Override
	public boolean aplica_desconto_de(double porcentagem){
		return false;
	}
	

}
