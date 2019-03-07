package com.sjcdigital.sjcedu.robot.model.entities;

import java.util.List;

public class Aprovacoes {

	private List<TaxaAprovacao> taxaAprovacao;
	private String indicadorRendimento;

	public List<TaxaAprovacao> getTaxaAprovacao() {
		return taxaAprovacao;
	}

	public void setTaxaAprovacao(List<TaxaAprovacao> taxaAprovacao) {
		this.taxaAprovacao = taxaAprovacao;
	}

	public String getIndicadorRendimento() {
		return indicadorRendimento;
	}

	public void setIndicadorRendimento(String indicadorRendimento) {
		this.indicadorRendimento = indicadorRendimento;
	}

}
