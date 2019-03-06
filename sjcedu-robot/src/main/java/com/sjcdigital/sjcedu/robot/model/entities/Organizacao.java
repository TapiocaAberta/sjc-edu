package com.sjcdigital.sjcedu.robot.model.entities;

public class Organizacao {

	private IndicadorEsforcoDocente esforcoDocente;
	private MediaAlunoPorTurma mediaAlunoPorTurma;
	private IndicacaoAdequacaoFormacaoDocente indicadorFormacaoDocente;
	private String alunosPorComputador;
	private String compParaUsosAdm;
	private String participaMaisEducacao;
	private String ofereceAtivComplementares;
	private String abreFinaisDeSemana;
	private String salaProfessores;
	private String salaSecretaria;
	private String salaDiretoria;
	private String almoxarifado;
	private String refeitorio;
	private String destinacaoLixo;

	public Organizacao() {}
	
	public Organizacao(IndicadorEsforcoDocente esforcoDocente, MediaAlunoPorTurma mediaAlunoPorTurma,
			IndicacaoAdequacaoFormacaoDocente indicadorFormacaoDocente, String alunosPorComputador,
			String compParaUsosAdm, String participaMaisEducacao, String ofereceAtivComplementares,
			String abreFinaisDeSemana, String salaProfessores, String salaSecretaria, String salaDiretoria,
			String almoxarifado, String refeitorio, String destinacaoLixo) {
		
		this.esforcoDocente = esforcoDocente;
		this.mediaAlunoPorTurma = mediaAlunoPorTurma;
		this.indicadorFormacaoDocente = indicadorFormacaoDocente;
		this.alunosPorComputador = alunosPorComputador;
		this.compParaUsosAdm = compParaUsosAdm;
		this.participaMaisEducacao = participaMaisEducacao;
		this.ofereceAtivComplementares = ofereceAtivComplementares;
		this.abreFinaisDeSemana = abreFinaisDeSemana;
		this.salaProfessores = salaProfessores;
		this.salaSecretaria = salaSecretaria;
		this.salaDiretoria = salaDiretoria;
		this.almoxarifado = almoxarifado;
		this.refeitorio = refeitorio;
		this.destinacaoLixo = destinacaoLixo;
	}

	public IndicadorEsforcoDocente getEsforcoDocente() {
		return esforcoDocente;
	}

	public void setEsforcoDocente(IndicadorEsforcoDocente esforcoDocente) {
		this.esforcoDocente = esforcoDocente;
	}

	public String getAlunosPorComputador() {
		return alunosPorComputador;
	}

	public void setAlunosPorComputador(String alunosPorComputador) {
		this.alunosPorComputador = alunosPorComputador;
	}

	public String getCompParaUsosAdm() {
		return compParaUsosAdm;
	}

	public void setCompParaUsosAdm(String compParaUsosAdm) {
		this.compParaUsosAdm = compParaUsosAdm;
	}

	public String getParticipaMaisEducacao() {
		return participaMaisEducacao;
	}

	public void setParticipaMaisEducacao(String participaMaisEducacao) {
		this.participaMaisEducacao = participaMaisEducacao;
	}

	public String getOfereceAtivComplementares() {
		return ofereceAtivComplementares;
	}

	public void setOfereceAtivComplementares(String ofereceAtivComplementares) {
		this.ofereceAtivComplementares = ofereceAtivComplementares;
	}

	public String getAbreFinaisDeSemana() {
		return abreFinaisDeSemana;
	}

	public void setAbreFinaisDeSemana(String abreFinaisDeSemana) {
		this.abreFinaisDeSemana = abreFinaisDeSemana;
	}

	public String getSalaProfessores() {
		return salaProfessores;
	}

	public void setSalaProfessores(String salaProfessores) {
		this.salaProfessores = salaProfessores;
	}

	public String getSalaSecretaria() {
		return salaSecretaria;
	}

	public void setSalaSecretaria(String salaSecretaria) {
		this.salaSecretaria = salaSecretaria;
	}

	public String getSalaDiretoria() {
		return salaDiretoria;
	}

	public void setSalaDiretoria(String salaDiretoria) {
		this.salaDiretoria = salaDiretoria;
	}

	public String getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(String almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public String getRefeitorio() {
		return refeitorio;
	}

	public void setRefeitorio(String refeitorio) {
		this.refeitorio = refeitorio;
	}

	public String getDestinacaoLixo() {
		return destinacaoLixo;
	}

	public void setDestinacaoLixo(String destinacaoLixo) {
		this.destinacaoLixo = destinacaoLixo;
	}

	public MediaAlunoPorTurma getMediaAlunoPorTurma() {
		return mediaAlunoPorTurma;
	}

	public void setMediaAlunoPorTurma(MediaAlunoPorTurma mediaAlunoPorTurma) {
		this.mediaAlunoPorTurma = mediaAlunoPorTurma;
	}

	public IndicacaoAdequacaoFormacaoDocente getIndicadorFormacaoDocente() {
		return indicadorFormacaoDocente;
	}

	public void setIndicadorFormacaoDocente(IndicacaoAdequacaoFormacaoDocente indicadorFormacaoDocente) {
		this.indicadorFormacaoDocente = indicadorFormacaoDocente;
	}
}
