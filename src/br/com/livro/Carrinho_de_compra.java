/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 */
public class Carrinho_de_compra {
	
	private double total;
		
	

	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto);
		total += produto.getValor();
		
	}
	
	public double getTotal(){
		return total;
	}
	
	

}
