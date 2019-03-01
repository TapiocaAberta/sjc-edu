package com.sjcdigital.sjcedu.robot.entities;

/**
 * 
 * @author pedro-hos
 *
 */
public class Endereco {

	private String endereco;
	private String bairro;
	private String cep;
	private String municipio;
	private String uf;
	private String localizacao;
	private String locDiferenciada;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLocDiferenciada() {
		return locDiferenciada;
	}

	public void setLocDiferenciada(String locDiferenciada) {
		this.locDiferenciada = locDiferenciada;
	}

}
