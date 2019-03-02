package com.sjcdigital.sjcedu.robot.model.entities;

public class EspacoAprendizagemEquip {

	private String biblioteca;
	private String salaLeitura;
	private String labCiencias;
	private String labInformatica;
	private String acessoInternet;
	private String bandaLarga;
	private String computadoresUsoAlunos;
	private String patioDescoberto;
	private String patioCoberto;
	private String auditorio;
	private String quadraCoberta;
	private String quadraDescoberta;
	private String parqueInfantil;
	private String areaVerde;

	public EspacoAprendizagemEquip() {}
	
	public EspacoAprendizagemEquip( String biblioteca, String salaLeitura, String labCiencias, String labInformatica,
									String acessoInternet, String bandaLarga, String computadoresUsoAlunos, String patioDescoberto,
									String patioCoberto, String auditorio, String quadraCoberta, String quadraDescoberta, String parqueInfantil,
									String areaVerde) {
		
		this.biblioteca = biblioteca;
		this.salaLeitura = salaLeitura;
		this.labCiencias = labCiencias;
		this.labInformatica = labInformatica;
		this.acessoInternet = acessoInternet;
		this.bandaLarga = bandaLarga;
		this.computadoresUsoAlunos = computadoresUsoAlunos;
		this.patioDescoberto = patioDescoberto;
		this.patioCoberto = patioCoberto;
		this.auditorio = auditorio;
		this.quadraCoberta = quadraCoberta;
		this.quadraDescoberta = quadraDescoberta;
		this.parqueInfantil = parqueInfantil;
		this.areaVerde = areaVerde;
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
