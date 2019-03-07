package com.sjcdigital.sjcedu.robot.model.entities;

public class ResultadoSaeb {

	private String proficienciaMedia;
	private String proficienciaPadronizada;
	
	public ResultadoSaeb() {}
	
	public ResultadoSaeb(String proficienciaMedia, String proficienciaPadronizada) {
		this.proficienciaMedia = proficienciaMedia;
		this.proficienciaPadronizada = proficienciaPadronizada;
	}

	public String getProficienciaMedia() {
		return proficienciaMedia;
	}

	public void setProficienciaMedia(String proficienciaMedia) {
		this.proficienciaMedia = proficienciaMedia;
	}

	public String getProficienciaPadronizada() {
		return proficienciaPadronizada;
	}

	public void setProficienciaPadronizada(String proficienciaPadronizada) {
		this.proficienciaPadronizada = proficienciaPadronizada;
	}

}
