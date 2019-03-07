package com.sjcdigital.sjcedu.robot.model.entities;

public class TaxaAprovacao {

	private String serie;
	private String valor;

	public TaxaAprovacao() {}
	
	public TaxaAprovacao(final String serie, final String valor) {
		this.serie = serie;
		this.valor = valor;
	}
	
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
