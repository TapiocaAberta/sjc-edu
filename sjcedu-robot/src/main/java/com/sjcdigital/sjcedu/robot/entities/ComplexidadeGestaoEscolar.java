package com.sjcdigital.sjcedu.robot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ComplexidadeGestaoEscolar {

	@JsonProperty("Matrículas [strHint001]")
	private String matriculas;
	
	@JsonProperty("Matrículas em tempo integral [strHint002]")
	private String matriculasTempoIntegral;
	
	@JsonProperty("Turmas [strHint003]")
	private String turmas;
	
	@JsonProperty("Turmas multi [strHint004]")
	private String turmasMulti;
	
	@JsonProperty("Turnos de funcionamento [strHint005]")
	private String turnosFuncionamento;
	
	@JsonProperty("Salas de aula [strHint006]")
	private String salasDeAula;
	
	@JsonProperty("Docentes")
	private String docentes;
	
	@JsonProperty("AuxiliaresZZZ monitoresZZZ tradutores de Libras [strHint007]")
	private String monitorLibras;
	
	@JsonProperty("Total de funcionários [strHint008]")
	private String totalFuncionario;
	
	@JsonProperty("Indicador de Nível Socioeconômico – INSE [strHint009]")
	private String inse;
	
	@JsonProperty("Indicador de Complexidade de gestão [strHint010]")
	private String complexidadeGestao;
	
	@JsonProperty("ModalidadesZZZ Etapas oferecidas [strHint011]")
	private String modalidades;

	public String getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(String matriculas) {
		this.matriculas = matriculas;
	}

	public String getMatriculasTempoIntegral() {
		return matriculasTempoIntegral;
	}

	public void setMatriculasTempoIntegral(String matriculasTempoIntegral) {
		this.matriculasTempoIntegral = matriculasTempoIntegral;
	}

	public String getTurmas() {
		return turmas;
	}

	public void setTurmas(String turmas) {
		this.turmas = turmas;
	}

	public String getTurmasMulti() {
		return turmasMulti;
	}

	public void setTurmasMulti(String turmasMulti) {
		this.turmasMulti = turmasMulti;
	}

	public String getTurnosFuncionamento() {
		return turnosFuncionamento;
	}

	public void setTurnosFuncionamento(String turnosFuncionamento) {
		this.turnosFuncionamento = turnosFuncionamento;
	}

	public String getSalasDeAula() {
		return salasDeAula;
	}

	public void setSalasDeAula(String salasDeAula) {
		this.salasDeAula = salasDeAula;
	}

	public String getDocentes() {
		return docentes;
	}

	public void setDocentes(String docentes) {
		this.docentes = docentes;
	}

	public String getMonitorLibras() {
		return monitorLibras;
	}

	public void setMonitorLibras(String monitorLibras) {
		this.monitorLibras = monitorLibras;
	}

	public String getTotalFuncionario() {
		return totalFuncionario;
	}

	public void setTotalFuncionario(String totalFuncionario) {
		this.totalFuncionario = totalFuncionario;
	}

	public String getInse() {
		return inse;
	}

	public void setInse(String inse) {
		this.inse = inse;
	}

	public String getComplexidadeGestao() {
		return complexidadeGestao;
	}

	public void setComplexidadeGestao(String complexidadeGestao) {
		this.complexidadeGestao = complexidadeGestao;
	}

	public String getModalidades() {
		return modalidades;
	}

	public void setModalidades(String modalidades) {
		this.modalidades = modalidades;
	}
}
