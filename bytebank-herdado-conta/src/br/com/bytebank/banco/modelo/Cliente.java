package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente Bytebank
 * 
 * @author henri
 * version 0.1
 */

public class Cliente {
	
	private String nome;
	private String CPF;
	private String profiss�o;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getProfiss�o() {
		return profiss�o;
	}
	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	}
	
	

}
