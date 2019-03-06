package com.sjcdigital.sjcedu.robot.model.entities;

public class IndicadorEsforcoDocente {
	
	private String anosIniciais;
	private String anosFinais;
	private String ensinoMedio;

	public IndicadorEsforcoDocente() {} 
	
	public IndicadorEsforcoDocente(String anosIniciais, String anosFinais, String ensinoMedio) {
		this.anosIniciais = anosIniciais;
		this.anosFinais = anosFinais;
		this.ensinoMedio = ensinoMedio;
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
