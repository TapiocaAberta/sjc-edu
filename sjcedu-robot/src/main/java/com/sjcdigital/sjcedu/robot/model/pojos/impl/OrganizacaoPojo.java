package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizacaoPojo {

	@JsonProperty("Indicador do esforço docente")
	private IndicadorEsforcoDocentePojo esforcoDocente;

	@JsonProperty("Média de alunos por turma")
	private MediaAlunoPorTurmaPojo mediaAlunoPorTurma;

	@JsonProperty("Indicador de adequação da formação do docente [strHint020]")
	private IndicacaoAdequacaoFormacaoDocentePojo indicadorFormacaoDocente;

	@JsonProperty("Alunos por computador [strHint018]")
	private String alunosPorComputador;

	@JsonProperty("Computadores para uso administrativo")
	private String compParaUsosAdm;

	@JsonProperty("Participa do Mais Educação [strHint019]")
	private String participaMaisEducacao;

	@JsonProperty("Escola oferece atividades complementares")
	private String ofereceAtivComplementares;

	@JsonProperty("Escola abre nos finais de semana para a comunidade")
	private String abreFinaisDeSemana;

	@JsonProperty("Sala de professores")
	private String salaProfessores;

	@JsonProperty("Sala de secretaria")
	private String salaSecretaria;

	@JsonProperty("Sala de diretoria")
	private String salaDiretoria;

	@JsonProperty("Almoxarifado")
	private String almoxarifado;

	@JsonProperty("Refeitório")
	private String refeitorio;

	@JsonProperty("Destinação do lixo")
	private String destinacaoLixo;

	public IndicadorEsforcoDocentePojo getEsforcoDocente() {
		return esforcoDocente;
	}

	public void setEsforcoDocente(IndicadorEsforcoDocentePojo esforcoDocente) {
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

	public MediaAlunoPorTurmaPojo getMediaAlunoPorTurma() {
		return mediaAlunoPorTurma;
	}

	public void setMediaAlunoPorTurma(MediaAlunoPorTurmaPojo mediaAlunoPorTurma) {
		this.mediaAlunoPorTurma = mediaAlunoPorTurma;
	}

	public IndicacaoAdequacaoFormacaoDocentePojo getIndicadorFormacaoDocente() {
		return indicadorFormacaoDocente;
	}

	public void setIndicadorFormacaoDocente(IndicacaoAdequacaoFormacaoDocentePojo indicadorFormacaoDocente) {
		this.indicadorFormacaoDocente = indicadorFormacaoDocente;
	}
}
