package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndicacaoAdequacaoFormacaoDocentePojo {

	@JsonProperty("Anos iniciais do Ensino Fundamental")
	private AnosIniciaisEFPojo anosIniciais;

	@JsonProperty("Anos finais do Ensino Fundamental")
	private AnosFinaisEFPojo anosFinais;

	@JsonProperty("Ensino Médio")
	private EnsinoMedioPojo ensinoMedio;

	public AnosIniciaisEFPojo getAnosIniciais() {
		return anosIniciais;
	}

	public void setAnosIniciais(AnosIniciaisEFPojo anosIniciais) {
		this.anosIniciais = anosIniciais;
	}

	public AnosFinaisEFPojo getAnosFinais() {
		return anosFinais;
	}

	public void setAnosFinais(AnosFinaisEFPojo anosFinais) {
		this.anosFinais = anosFinais;
	}

	public EnsinoMedioPojo getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(EnsinoMedioPojo ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}
}
