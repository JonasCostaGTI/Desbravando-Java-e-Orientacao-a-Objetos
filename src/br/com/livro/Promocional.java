package br.com.livro;

@FunctionalInterface
public interface Promocional {
	
	boolean aplica_desconto_de(double porcentagem);
	
	default boolean aplica_desconto_10porcento(){
		return aplica_desconto_de(0.1);
	}

}
