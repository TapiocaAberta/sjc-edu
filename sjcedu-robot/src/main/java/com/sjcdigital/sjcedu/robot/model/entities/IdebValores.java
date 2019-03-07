package com.sjcdigital.sjcedu.robot.model.entities;

import java.util.Collection;

public class IdebValores {

	private Collection<Indice> anosIniciaisIdeb;
	private Collection<Indice> anosFinaisIdeb;
	private Collection<Indice> ensinoMedioIdeb;
	
	public Collection<Indice> getAnosIniciaisIdeb() {
		return anosIniciaisIdeb;
	}
	public void setAnosIniciaisIdeb(Collection<Indice> anosIniciaisIdeb) {
		this.anosIniciaisIdeb = anosIniciaisIdeb;
	}
	public Collection<Indice> getAnosFinaisIdeb() {
		return anosFinaisIdeb;
	}
	public void setAnosFinaisIdeb(Collection<Indice> anosFinaisIdeb) {
		this.anosFinaisIdeb = anosFinaisIdeb;
	}
	public Collection<Indice> getEnsinoMedioIdeb() {
		return ensinoMedioIdeb;
	}
	public void setEnsinoMedioIdeb(Collection<Indice> ensinoMedioIdeb) {
		this.ensinoMedioIdeb = ensinoMedioIdeb;
	}

}
