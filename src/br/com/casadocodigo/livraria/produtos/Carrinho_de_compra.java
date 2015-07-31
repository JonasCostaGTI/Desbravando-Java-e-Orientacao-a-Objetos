/**
 * 
 */
package br.com.casadocodigo.livraria.produtos;

import java.util.ArrayList;
import java.util.List;


/**
 * @author jonascosta
 */
public class Carrinho_de_compra {
	
	private double total;
	private List<Produto> produtos;
	
	
	public Carrinho_de_compra(){
		this.produtos = new ArrayList<Produto>();
	}
		
	public void adiciona(Produto produto){
		this.total += produto.getValor();
		this.produtos.add(produto);
	}
	
	public void remove(int posicao){
		this.produtos.remove(posicao);
	}
	
	public double getTotal(){
		return total;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	
	
	

}
