/**
 * 
 */
package br.com.livro;

/**
 * @author jonascosta
 */
public class Autor {
	
	private String nome;
	private String e_mail;
	private String CPF;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getE_mail() {
		return e_mail;
	}



	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}



	public String getCPF() {
		return CPF;
	}



	public void setCPF(String cPF) {
		CPF = cPF;
	}



	void mostra_detalhes(){
		if(this.nome != null){
			System.out.println("DETALHES DO AUTOR DO LIVRO ");
			System.out.println("O nome do autor do livro é, "+nome);
			System.out.println("seu e-mail é: "+e_mail);
			System.out.println("e seu CPF é: "+ CPF);
		}else{
			System.out.println("nao a detalhes do autor");
		}
		
	
		
		
	}
	
	
	
		
	
	
}
