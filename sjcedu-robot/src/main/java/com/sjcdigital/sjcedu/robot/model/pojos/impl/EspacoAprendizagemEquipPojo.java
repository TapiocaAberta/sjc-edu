package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.EspacoAprendizagemEquip;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

public class EspacoAprendizagemEquipPojo implements Pojo {

	@JsonProperty("Biblioteca")
	private String biblioteca;

	@JsonProperty("Sala de leitura")
	private String salaLeitura;

	@JsonProperty("Laboratório de ciências")
	private String labCiencias;

	@JsonProperty("Laboratório de informática")
	private String labInformatica;

	@JsonProperty("Acesso à internet")
	private String acessoInternet;

	@JsonProperty("Banda larga")
	private String bandaLarga;

	@JsonProperty("Computadores para uso dos alunos")
	private String computadoresUsoAlunos;

	@JsonProperty("Pátio descoberto")
	private String patioDescoberto;

	@JsonProperty("Pátio coberto")
	private String patioCoberto;

	@JsonProperty("Auditório")
	private String auditorio;

	@JsonProperty("Quadra de esportes coberta")
	private String quadraCoberta;

	@JsonProperty("Quadra de esportes descoberta")
	private String quadraDescoberta;

	@JsonProperty("Parque infantil")
	private String parqueInfantil;

	@JsonProperty("Área verde")
	private String areaVerde;

	@Override
	public EspacoAprendizagemEquip paraEntidade() {
		return new EspacoAprendizagemEquip( biblioteca, salaLeitura, labCiencias, labInformatica, acessoInternet,
											bandaLarga, computadoresUsoAlunos, patioDescoberto, patioCoberto, auditorio, quadraCoberta,
											quadraDescoberta, parqueInfantil, areaVerde );
	}

	public String getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(String biblioteca) {
		this.biblioteca = biblioteca;
	}

	public String getSalaLeitura() {
		return salaLeitura;
	}

	public void setSalaLeitura(String salaLeitura) {
		this.salaLeitura = salaLeitura;
	}

	public String getLabCiencias() {
		return labCiencias;
	}

	public void setLabCiencias(String labCiencias) {
		this.labCiencias = labCiencias;
	}

	public String getLabInformatica() {
		return labInformatica;
	}

	public void setLabInformatica(String labInformatica) {
		this.labInformatica = labInformatica;
	}

	public String getAcessoInternet() {
		return acessoInternet;
	}

	public void setAcessoInternet(String acessoInternet) {
		this.acessoInternet = acessoInternet;
	}

	public String getBandaLarga() {
		return bandaLarga;
	}

	public void setBandaLarga(String bandaLarga) {
		this.bandaLarga = bandaLarga;
	}

	public String getComputadoresUsoAlunos() {
		return computadoresUsoAlunos;
	}

	public void setComputadoresUsoAlunos(String computadoresUsoAlunos) {
		this.computadoresUsoAlunos = computadoresUsoAlunos;
	}

	public String getPatioDescoberto() {
		return patioDescoberto;
	}

	public void setPatioDescoberto(String patioDescoberto) {
		this.patioDescoberto = patioDescoberto;
	}

	public String getPatioCoberto() {
		return patioCoberto;
	}

	public void setPatioCoberto(String patioCoberto) {
		this.patioCoberto = patioCoberto;
	}

	public String getAuditorio() {
		return auditorio;
	}

	public void setAuditorio(String auditorio) {
		this.auditorio = auditorio;
	}

	public String getQuadraCoberta() {
		return quadraCoberta;
	}

	public void setQuadraCoberta(String quadraCoberta) {
		this.quadraCoberta = quadraCoberta;
	}

	public String getQuadraDescoberta() {
		return quadraDescoberta;
	}

	public void setQuadraDescoberta(String quadraDescoberta) {
		this.quadraDescoberta = quadraDescoberta;
	}

	public String getParqueInfantil() {
		return parqueInfantil;
	}

	public void setParqueInfantil(String parqueInfantil) {
		this.parqueInfantil = parqueInfantil;
	}

	public String getAreaVerde() {
		return areaVerde;
	}

	public void setAreaVerde(String areaVerde) {
		this.areaVerde = areaVerde;
	}

}
