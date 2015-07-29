/**
 * 
 */
package br.com.casadocodigo.livraria.produtos;

import java.util.ArrayList;


/**
 * @author jonascosta
 */
public class Carrinho_de_compra {
	
	private double total;
	private ArrayList<Produto> produtos;
	
	
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
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
	
	

}
