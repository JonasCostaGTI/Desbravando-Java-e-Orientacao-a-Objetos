/**
 * 
 */
package br.com.casadocodigo.livraria.produtos;


/**
 * @author jonascosta
 */
public class Carrinho_de_compra {
	
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	
		
	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto);
		produtos[contador] = produto; 
		this.total += produto.getValor();
		contador++;
	
		}
		
	
	public double getTotal(){
		return total;
	}
	
	
	
	

}
