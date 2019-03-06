package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.IndicacaoAdequacaoFormacaoDocente;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

public class IndicacaoAdequacaoFormacaoDocentePojo implements Pojo {

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

	@Override
	public IndicacaoAdequacaoFormacaoDocente paraEntidade() {
		return new IndicacaoAdequacaoFormacaoDocente(anosIniciais.paraEntidade(), anosFinais.paraEntidade(), ensinoMedio.paraEntidade());
	}
}
