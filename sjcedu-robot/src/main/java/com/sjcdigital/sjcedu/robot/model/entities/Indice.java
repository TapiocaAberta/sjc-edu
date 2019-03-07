package com.sjcdigital.sjcedu.robot.model.entities;

public class Indice {

	private String ano;
	private Aprovacoes aprovacoes;
	private Saeb saeb;
	private Ideb ideb;
	
	public Indice() {}
	
	public Indice(String ano) {
		this.ano = ano;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Aprovacoes getAprovacoes() {
		return aprovacoes;
	}

	public void setAprovacoes(Aprovacoes aprovacoes) {
		this.aprovacoes = aprovacoes;
	}

	public Saeb getSaeb() {
		return saeb;
	}

	public void setSaeb(Saeb saeb) {
		this.saeb = saeb;
	}

	public Ideb getIdeb() {
		return ideb;
	}

	public void setIdeb(Ideb ideb) {
		this.ideb = ideb;
	}

}
