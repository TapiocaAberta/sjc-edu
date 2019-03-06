package com.sjcdigital.sjcedu.robot.model.entities;

public class MediaAlunoPorTurma {

	private String educacaoInfantil;
	private String anosIniciais;
	private String anosFinais;
	private String ensinoMedio;

	public MediaAlunoPorTurma() {}
	
	public MediaAlunoPorTurma(String educacaoInfantil, String anosIniciais, String anosFinais, String ensinoMedio) {
		this.educacaoInfantil = educacaoInfantil;
		this.anosIniciais = anosIniciais;
		this.anosFinais = anosFinais;
		this.ensinoMedio = ensinoMedio;
	}

	public String getEducacaoInfantil() {
		return educacaoInfantil;
	}

	public void setEducacaoInfantil(String educacaoInfantil) {
		this.educacaoInfantil = educacaoInfantil;
	}

	public String getAnosIniciais() {
		return anosIniciais;
	}

	public void setAnosIniciais(String anosIniciais) {
		this.anosIniciais = anosIniciais;
	}

	public String getAnosFinais() {
		return anosFinais;
	}

	public void setAnosFinais(String anosFinais) {
		this.anosFinais = anosFinais;
	}

	public String getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(String ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}

}
