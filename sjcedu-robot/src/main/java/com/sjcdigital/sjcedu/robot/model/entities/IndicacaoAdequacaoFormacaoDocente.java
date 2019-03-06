package com.sjcdigital.sjcedu.robot.model.entities;

public class IndicacaoAdequacaoFormacaoDocente {

	private AnosIniciaisEF anosIniciais;
	private AnosFinaisEF anosFinais;
	private EnsinoMedio ensinoMedio;

	public IndicacaoAdequacaoFormacaoDocente() {}
	
	public IndicacaoAdequacaoFormacaoDocente(AnosIniciaisEF anosIniciais, AnosFinaisEF anosFinais, EnsinoMedio ensinoMedio) {
		this.anosIniciais = anosIniciais;
		this.anosFinais = anosFinais;
		this.ensinoMedio = ensinoMedio;
	}

	public AnosIniciaisEF getAnosIniciais() {
		return anosIniciais;
	}

	public void setAnosIniciais(AnosIniciaisEF anosIniciais) {
		this.anosIniciais = anosIniciais;
	}

	public AnosFinaisEF getAnosFinais() {
		return anosFinais;
	}

	public void setAnosFinais(AnosFinaisEF anosFinais) {
		this.anosFinais = anosFinais;
	}

	public Grupos getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(EnsinoMedio ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}
}
