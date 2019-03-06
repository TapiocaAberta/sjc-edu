package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.IndicadorEsforcoDocente;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

public class IndicadorEsforcoDocentePojo implements Pojo {

	@JsonProperty("Anos iniciais [strHint017]")
	private String anosIniciais;
	
	@JsonProperty("Anos finais [strHint033]")
	private String anosFinais;
	
	@JsonProperty("Ensino médio [strHint034]")
	private String ensinoMedio;

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

	@Override
	public IndicadorEsforcoDocente paraEntidade() {
		return new IndicadorEsforcoDocente(anosIniciais, anosFinais, ensinoMedio);
	}
}
