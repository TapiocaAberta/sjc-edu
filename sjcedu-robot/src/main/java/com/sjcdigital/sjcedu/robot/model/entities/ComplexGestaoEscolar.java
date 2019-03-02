package com.sjcdigital.sjcedu.robot.model.entities;

public class ComplexGestaoEscolar {

	private String matriculas;
	private String matriculasTempoIntegral;
	private String turmas;
	private String turmasMulti;
	private String turnosFuncionamento;
	private String salasDeAula;
	private String docentes;
	private String monitorLibras;
	private String totalFuncionario;
	
	public ComplexGestaoEscolar() { }

	public ComplexGestaoEscolar( String matriculas, String matriculasTempoIntegral, String turmas, String turmasMulti,
							     String turnosFuncionamento, String salasDeAula, String docentes, String monitorLibras,
							     String totalFuncionario, String inse, String complexidadeGestao, String modalidades ) {
		
		this.matriculas = matriculas;
		this.matriculasTempoIntegral = matriculasTempoIntegral;
		this.turmas = turmas;
		this.turmasMulti = turmasMulti;
		this.turnosFuncionamento = turnosFuncionamento;
		this.salasDeAula = salasDeAula;
		this.docentes = docentes;
		this.monitorLibras = monitorLibras;
		this.totalFuncionario = totalFuncionario;
		this.inse = inse;
		this.complexidadeGestao = complexidadeGestao;
		this.modalidades = modalidades;
	}

	private String inse;
	private String complexidadeGestao;
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
