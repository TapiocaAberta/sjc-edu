package com.sjcdigital.sjcedu.robot.model.entities;

public class ResultadosSaeb {
	
	private ResultadoSaeb total;
	private ResultadoSaeb percTempoIntegral;
	private ResultadoSaeb idadeMedia;
	private ResultadoSaeb percIncluidos;
	private ResultadoSaeb percNaoAprovados;

	public ResultadoSaeb getTotal() {
		return total;
	}

	public void setTotal(ResultadoSaeb total) {
		this.total = total;
	}

	public ResultadoSaeb getPercTempoIntegral() {
		return percTempoIntegral;
	}

	public void setPercTempoIntegral(ResultadoSaeb percTempoIntegral) {
		this.percTempoIntegral = percTempoIntegral;
	}

	public ResultadoSaeb getIdadeMedia() {
		return idadeMedia;
	}

	public void setIdadeMedia(ResultadoSaeb idadeMedia) {
		this.idadeMedia = idadeMedia;
	}

	public ResultadoSaeb getPercIncluidos() {
		return percIncluidos;
	}

	public void setPercIncluidos(ResultadoSaeb percIncluidos) {
		this.percIncluidos = percIncluidos;
	}

	public ResultadoSaeb getPercNaoAprovados() {
		return percNaoAprovados;
	}

	public void setPercNaoAprovados(ResultadoSaeb percNaoAprovados) {
		this.percNaoAprovados = percNaoAprovados;
	}

}
