/**
 * 
 */
package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * @author jonascosta
 *
 * 10/07/2015
 */

public class Mini_livro extends Livro implements Promocional {
	
	public Mini_livro(Autor autor){
		super(autor);
	}
	
	@Override
	public boolean aplica_desconto_de(double porcentagem){
		return false;
	}
	

}
