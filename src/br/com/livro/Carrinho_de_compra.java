/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 */
public class Carrinho_de_compra {
	
	private double total;
		
	

	public void adiciona(Livro livro) {
		System.out.println("Adicionado: " + livro);
		
		livro.aplica_desconto_de(0.16);
		total += livro.getValor();
		
	}
	
	public double getTotal(){
		return total;
	}
	
	

}
