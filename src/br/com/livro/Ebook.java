/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 * 
 * éssa classe possui os mesmos atributos da Classe Livro 
 */
public class Ebook extends Livro{
	
	private String water_mark;
	
	public Ebook(Autor autor){
		super(autor);
	}
	

	public String getWater_mark() {
		return water_mark;
	}

	public void setWater_mark(String water_mark) {
		this.water_mark = water_mark;
	}
	
	@Override
	public boolean aplica_desconto_de(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		setValor(getValor() * porcentagem);
		return true;
		
	}
	
}
